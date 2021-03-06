/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
 *   Copyright (C) 2013-2014 by Saverio Giallorenzo <sgiallor@cs.unibo.it> *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/


package org.epp.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import jolie.lang.NativeType;
import jolie.lang.Constants.OperandType;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.Scanner;
import jolie.lang.parse.ast.AddAssignStatement;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.CompareConditionNode;
import jolie.lang.parse.ast.CompensateStatement;
import jolie.lang.parse.ast.CorrelationSetInfo;
import jolie.lang.parse.ast.CorrelationSetInfo.CorrelationAliasInfo;
import jolie.lang.parse.ast.CorrelationSetInfo.CorrelationVariableInfo;
import jolie.lang.parse.ast.InputPortInfo.AggregationItemInfo;
import jolie.lang.parse.ast.CurrentHandlerStatement;
import jolie.lang.parse.ast.DeepCopyStatement;
import jolie.lang.parse.ast.DefinitionCallStatement;
import jolie.lang.parse.ast.DefinitionNode;
import jolie.lang.parse.ast.DivideAssignStatement;
import jolie.lang.parse.ast.DocumentationComment;
import jolie.lang.parse.ast.EmbeddedServiceNode;
import jolie.lang.parse.ast.ExecutionInfo;
import jolie.lang.parse.ast.ExitStatement;
import jolie.lang.parse.ast.ForEachArrayItemStatement;
import jolie.lang.parse.ast.ForEachSubNodeStatement;
import jolie.lang.parse.ast.ForStatement;
import jolie.lang.parse.ast.IfStatement;
import jolie.lang.parse.ast.InputPortInfo;
import jolie.lang.parse.ast.InstallFixedVariableExpressionNode;
import jolie.lang.parse.ast.InstallStatement;
import jolie.lang.parse.ast.InterfaceDefinition;
import jolie.lang.parse.ast.InterfaceExtenderDefinition;
import jolie.lang.parse.ast.LinkInStatement;
import jolie.lang.parse.ast.LinkOutStatement;
import jolie.lang.parse.ast.MultiplyAssignStatement;
import jolie.lang.parse.ast.NDChoiceStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationDeclaration;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.OperationCollector;
import jolie.lang.parse.ast.OperationDeclaration;
import jolie.lang.parse.ast.OutputPortInfo;
import jolie.lang.parse.ast.ParallelStatement;
import jolie.lang.parse.ast.PointerStatement;
import jolie.lang.parse.ast.PostDecrementStatement;
import jolie.lang.parse.ast.PostIncrementStatement;
import jolie.lang.parse.ast.PreDecrementStatement;
import jolie.lang.parse.ast.PreIncrementStatement;
import jolie.lang.parse.ast.Program;
import jolie.lang.parse.ast.ProvideUntilStatement;
import jolie.lang.parse.ast.RequestResponseOperationDeclaration;
import jolie.lang.parse.ast.RequestResponseOperationStatement;
import jolie.lang.parse.ast.RunStatement;
import jolie.lang.parse.ast.Scope;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.SpawnStatement;
import jolie.lang.parse.ast.SubtractAssignStatement;
import jolie.lang.parse.ast.SynchronizedStatement;
import jolie.lang.parse.ast.ThrowStatement;
import jolie.lang.parse.ast.TypeCastExpressionNode;
import jolie.lang.parse.ast.UndefStatement;
import jolie.lang.parse.ast.ValueVectorSizeExpressionNode;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.WhileStatement;
import jolie.lang.parse.ast.courier.CourierChoiceStatement;
import jolie.lang.parse.ast.courier.CourierDefinitionNode;
import jolie.lang.parse.ast.courier.NotificationForwardStatement;
import jolie.lang.parse.ast.courier.SolicitResponseForwardStatement;
import jolie.lang.parse.ast.expression.AndConditionNode;
import jolie.lang.parse.ast.expression.ConstantBoolExpression;
import jolie.lang.parse.ast.expression.ConstantDoubleExpression;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantLongExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.FreshValueExpressionNode;
import jolie.lang.parse.ast.expression.InlineTreeExpressionNode;
import jolie.lang.parse.ast.expression.InstanceOfExpressionNode;
import jolie.lang.parse.ast.expression.IsTypeExpressionNode;
import jolie.lang.parse.ast.expression.IsTypeExpressionNode.CheckType;
import jolie.lang.parse.ast.expression.NotExpressionNode;
import jolie.lang.parse.ast.expression.OrConditionNode;
import jolie.lang.parse.ast.expression.ProductExpressionNode;
import jolie.lang.parse.ast.expression.SumExpressionNode;
import jolie.lang.parse.ast.expression.VariableExpressionNode;
import jolie.lang.parse.ast.expression.VoidExpressionNode;
import jolie.lang.parse.ast.types.TypeChoiceDefinition;
import jolie.lang.parse.ast.types.TypeDefinition;
import jolie.lang.parse.ast.types.TypeDefinitionLink;
import jolie.lang.parse.ast.types.TypeInlineDefinition;
import jolie.util.Pair;
import jolie.util.Range;

public class JolieProcessPrettyPrinterVisitor implements OLVisitor
{
	private final PrettyPrinter printer;
	private boolean shouldPrintQuotes = true;

	public JolieProcessPrettyPrinterVisitor( PrettyPrinter printer )
	{
		this.printer = printer;
	}

	private void prettyPrint( OLSyntaxNode node )
	{
		if ( node != null ) {
			node.accept( this );
		}
	}
	
	@SuppressWarnings("incomplete-switch")
	private void prettyPrint( Scanner.TokenType tokenType )
	{
		String s = "";
		switch( tokenType ) {
		case AND:
			s = "&&";
			break;
		case OR:
			s = "||";
			break;
		case EQUAL:
			s = "==";
			break;
		case NOT_EQUAL:
			s = "!=";
			break;
		case LANGLE:
			s = "<";
			break;
		case RANGLE:
			s = ">";
			break;
		case MAJOR_OR_EQUAL:
			s = ">=";
			break;
		case MINOR_OR_EQUAL:
			s = "<=";
			break;
		}
		printer.write( s );
	}

	public void visit( Program n )
	{
		for( OLSyntaxNode child : n.children() ) {
			prettyPrint( child );
		}
	}

	
	public void visit( OneWayOperationDeclaration n )
	{
		printer.writeLineIndented( n.id() + "(undefined)" );
	}

	
	public void visit( RequestResponseOperationDeclaration n )
	{
		// TODO Auto-generated method stub

	}

	public void visit( DefinitionNode n )
	{
		if( n.id().equals( "onRun" ) ){
//			printer.write( "include \"../AbstractActivity.iol\"" );
			printer.writeLine();
		}
		if ( !n.id().equals( "main" )	&& !n.id().equals( "init" ) && !n.id().equals( "thread_main" ) ) {
			printer.writeIndented( "define " );
		}
		if( n.id().equals( "thread_main") ) {
			printer.writeIndented( "include \"AbstractClient.iol\"");
			printer.writeLine();
			printer.writeLineIndented( "main" );
		}
		else {
			printer.writeLineIndented( n.id() );
		}
		printer.writeLineIndented( "{" );
		printer.indent();
		prettyPrint( n.body() );
		printer.writeLine();
		printer.unindent();
		printer.writeLineIndented( "}" );
		printer.writeLine();
	}

	
	public void visit( ParallelStatement n )
	{
		for( int i = 0; i < n.children().size(); i++ ) {
			prettyPrint( n.children().get( i ) );
			printer.writeLine( "" );
			if ( i < n.children().size() - 1 ) {
				printer.writeLineIndented( "|" );
			}
		}
	}

	
	public void visit( SequenceStatement n )
	{
		for( int i = 0; i < n.children().size(); i++ ) {
			if ( n.children().get( i ) instanceof ParallelStatement ) {
				printer.writeLineIndented( "{" );
				printer.indent();
			}
			prettyPrint( n.children().get( i ) );
			if ( n.children().get( i ) instanceof ParallelStatement ) {
				printer.unindent();
				printer.writeLineIndented( "}" );
			}
			if ( i < n.children().size() - 1 ) {
				printer.writeLine( ";" );
			} else {
				printer.write( "" );
			}
		}
	}

	
	public void visit( NDChoiceStatement n )
	{
		int level;
		Pair< OLSyntaxNode, OLSyntaxNode > pair;
		for( int i = 0; i < n.children().size(); i++ ) {
			pair = n.children().get( i );
			printer.writeIndented( "[ " );
			level = printer.indentationLevel();
			printer.setIndentationLevel( 0 );
			prettyPrint( pair.key() );
			printer.setIndentationLevel( level );
			printer.writeLine( " ] {" );
			printer.indent();
			prettyPrint( pair.value() );
			printer.unindent();
			printer.writeLine();
			printer.writeIndented( "}" );
			if ( i < n.children().size() - 1 ) {
				printer.writeLine();
			}
		}
	}

	
	public void visit( OneWayOperationStatement n )
	{
		printer.writeIndented( n.id() + "( " );
		prettyPrint( n.inputVarPath() );
		printer.write( " )" );
	}

	
	public void visit( RequestResponseOperationStatement n )
	{
		printer.writeIndented( n.id() + "( " );
		prettyPrint( n.inputVarPath() );
		printer.write( " )( " );
		prettyPrint( n.outputExpression() );
		printer.writeLineIndented( " ) {" );
		printer.indent();
		prettyPrint( n.process() );
		printer.unindent();
		printer.writeLineIndented( "" );
		printer.writeIndented( "}" );
	}

	
	public void visit( NotificationOperationStatement n )
	{
		printer.writeIndented( n.id() + "@" + n.outputPortId() + "( " );
		prettyPrint( n.outputExpression() );
		printer.write( " )" );
	}

	
	public void visit( SolicitResponseOperationStatement n )
	{
		printer.writeIndented( n.id() + "@" + n.outputPortId() + "( " );
		prettyPrint( n.outputExpression() );
		printer.write( " )( " );
		prettyPrint( n.inputVarPath() );
		printer.write( " )" );
	}

	
	public void visit( LinkInStatement n )
	{
		printer.writeIndented("linkIn( " + n.id() + " )");
		printer.writeLine();
	}

	
	public void visit( LinkOutStatement n )
	{
		printer.writeIndented("linkOut( " + n.id() + " )");
		printer.writeLine();
	}

	
	public void visit( AssignStatement n )
	{
		printer.writeIndented( "" );
		prettyPrint( n.variablePath() );
		printer.write( " = " );
		prettyPrint( n.expression() );
	}

	
	public void visit( IfStatement n )
	{
		Pair< OLSyntaxNode, OLSyntaxNode > choice;
		for( int i = 0; i < n.children().size(); i++ ) {
			if ( i == 0 ) {
				printer.writeIndented( "if ( " );
			} else {
				printer.write( " else if ( " );
			}
			choice = n.children().get( i );
			prettyPrint( choice.key() );
			printer.writeLine( " ) {");
			printer.indent();
			prettyPrint( choice.value() );
			printer.unindent();
			printer.write( "\n" );
			printer.writeIndented( "}" );
		}
		if ( n.elseProcess() != null ) {
			printer.writeLine( " else {" );
			printer.indent();
			prettyPrint( n.elseProcess() );
			printer.unindent();
			printer.writeLine();
			printer.writeIndented( "}" );
		}
	}

	
	public void visit( DefinitionCallStatement n )
	{
		printer.writeIndented( n.id() );
	}

	
	public void visit( WhileStatement n )
	{
		printer.writeIndented( "while ( " );
		prettyPrint( n.condition() );
		printer.write( " ){");		
		printer.writeLine();
		printer.indent();
		prettyPrint( n.body() );
		printer.unindent();	
		printer.writeLine();
		printer.writeIndented("}");
	}

	
	public void visit( OrConditionNode n )
	{
		int i = 0;
		prettyPrint( n.children().get( 0 ) );
		i++;
		for( ; i < n.children().size(); i++ ) {
			printer.write( " || " );
			prettyPrint( n.children().get( i ) );
		}
	}

	
	public void visit( AndConditionNode n )
	{
		int i = 0;
		prettyPrint( n.children().get( 0 ) );
		i++;
		for( ; i < n.children().size(); i++ ) {
			printer.write( " && " );
			prettyPrint( n.children().get( i ) );
		}
	}
	
	public void visit( NotExpressionNode n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( CompareConditionNode n )
	{
		prettyPrint( n.leftExpression() );
		printer.write( " " );
		prettyPrint( n.opType() );
		printer.write( " " );
		prettyPrint( n.rightExpression() );
	}

	
	public void visit( ConstantIntegerExpression n )
	{
		printer.write( String.valueOf( n.value() ) );
	}

	
	public void visit( ConstantStringExpression n )
	{
		if ( shouldPrintQuotes ) {
			printer.write( "\"" );
		}
		printer.write( n.value() );
		if ( shouldPrintQuotes ) {
			printer.write( "\"" );
		}
	}

	
	public void visit( ProductExpressionNode n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( SumExpressionNode n )
	{
		Pair< OperandType, OLSyntaxNode > pair;
		Iterator< Pair< OperandType, OLSyntaxNode > > it = n.operands().iterator();
		for( int i = 0; i < n.operands().size(); i++ ) {
			pair = it.next();
			if ( i > 0 ) {
				if ( pair.key() == OperandType.ADD ) {
					printer.write( " + " );
				} else if ( pair.key() == OperandType.SUBTRACT ){
					printer.write( " - " );
				} else if ( pair.key() == OperandType.MULTIPLY ){
					printer.write( " * " );
				} else if ( pair.key() == OperandType.DIVIDE ){
					printer.write( " / " );
				}
			}
			prettyPrint( pair.value() );
		}
	}

	
	public void visit( VariableExpressionNode n )
	{
		prettyPrint( n.variablePath() );
	}
	
	public void visit( NullProcessStatement n )
	{
		printer.writeIndented( "nullProcess" );
	}

	
	public void visit( Scope n )
	{
		if( n.id() != null ){
			printer.writeIndented( "scope( " + n.id() + " )");
		}
		printer.writeIndented( "{" );
		printer.writeLine();
		printer.indent();
		prettyPrint( n.body() );
		printer.unindent();
		printer.writeLine();
		printer.writeIndented("}");
	}

	
	public void visit( InstallStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( CompensateStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( ThrowStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( ExitStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( ExecutionInfo n )
	{
		printer.writeIndented( "execution { " );
		printer.write( n.mode().name().toLowerCase() );
		printer.writeLineIndented( " }" );
		printer.writeLine();
	}

	
	public void visit( CorrelationSetInfo n )
	{
		printer.writeLineIndented( "cset { " );
		for( CorrelationVariableInfo var : n.variables() ) {
			prettyPrint( var.correlationVariablePath() );
			printer.writeLine( ":" );
			printer.indent();
			printer.writeIndented( "" );
			int i = 0;
			for( CorrelationAliasInfo alias : var.aliases() ) {
				printer.write( alias.guardName() + "." );
				prettyPrint( alias.variablePath() );
				if ( i++ < var.aliases().size() - 1 ) {
					printer.write( " " );
				} else {
					printer.writeLine();
				}
			}
			printer.unindent();
		}
		printer.writeLineIndented( "}" );
		printer.writeLine();
	}

	
	public void visit( InputPortInfo n )
	{
		printer.writeLineIndented( "inputPort " + n.id() + " {" );
		printer.writeIndented( "Location: " );
		printer.writeLine( "\"" + n.location().toString() + "\"" );
		if ( n.protocolId() != null ) {
			printer.writeIndented( "Protocol: " );
			printer.writeLine( n.protocolId() );
		}
		if ( !n.getInterfaceList().isEmpty() ) {
			printer.writeIndented( "Interfaces: " );
			int i = 0;
			for( InterfaceDefinition iface : n.getInterfaceList() ) {
				printer.write( iface.name() );
				if ( i++ < n.getInterfaceList().size() - 1 ) {
					printer.write( ", " );
				}
			}
			printer.writeLine();
		}
		if ( n.aggregationList() != null && n.aggregationList().length > 0  ){
			printer.writeIndented( "Aggregates: ");
			for( AggregationItemInfo aggregation : n.aggregationList()){
				for( String outputPort : aggregation.outputPortList() ){
					printer.write( outputPort );
				}
			}
			printer.writeLine();
		}
		printer.writeLineIndented( "}" );
		printer.writeLine();
	}

	
	public void visit( OutputPortInfo n )
	{
		printer.writeLineIndented( "outputPort " + n.id() + " {" );
		if ( n.location() != null ) {
			printer.writeIndented( "Location: " );
			printer.writeLine( "\"" + n.location().toString() + "\"" );
		}
		if ( n.protocolId() != null ) {
			printer.writeIndented( "Protocol: " );
			printer.writeLine( n.protocolId() );
		}
		if ( !n.getInterfaceList().isEmpty() ) {
			printer.writeIndented( "Interfaces: " );
			int i = 0;
			for( InterfaceDefinition iface : n.getInterfaceList() ) {
				printer.write( iface.name() );
				if ( i++ < n.getInterfaceList().size() - 1 ) {
					printer.write( ", " );
				}
			}
			printer.writeLine();
		}
		printOperationDeclarations( n );
		printer.writeLineIndented( "}" );
		printer.writeLine();
	}

	
	public void visit( PointerStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( DeepCopyStatement n )
	{
		printer.writeIndented( "" );
		prettyPrint( n.leftPath() );
		printer.write( " << " );
		prettyPrint( n.rightExpression() );
	}

	
	public void visit( RunStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( UndefStatement n )
	{
		printer.writeIndented( "undef( " );
		prettyPrint( n.variablePath() );
		printer.write( " )" );
	}

	
	public void visit( ValueVectorSizeExpressionNode n )
	{
		printer.write( "#" );
		prettyPrint( n.variablePath() );
	}

	
	public void visit( PreIncrementStatement n )
	{
		printer.writeIndented( "++" );
		prettyPrint( n.variablePath() );
	}

	
	public void visit( PostIncrementStatement n )
	{
		printer.writeIndented( "" );
		prettyPrint( n.variablePath() );
		printer.write( "++" );
	}

	
	public void visit( PreDecrementStatement n )
	{
		printer.writeIndented( "--" );
		prettyPrint( n.variablePath() );
	}

	
	public void visit( PostDecrementStatement n )
	{
		printer.writeIndented( "" );
		prettyPrint( n.variablePath() );
		printer.write( "--" );
	}

	
	public void visit( ForStatement n )
	{
		printer.writeIndented( "for ( " );
		printer.unindent();
		prettyPrint( n.init() );
		printer.write( ", " );
		prettyPrint( n.condition() );
		printer.write( ", " );
		printer.unindent();
		prettyPrint( n.post() );
		printer.write( " ){" );		
		printer.indent();
		printer.indent();
		printer.writeLine();
		printer.indent();
		prettyPrint( n.body() );
		printer.unindent();	
		printer.writeLine();
		printer.writeIndented("}");
	}

	
	public void visit( SpawnStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( IsTypeExpressionNode n )
	{
		if ( n.type() == CheckType.DEFINED ) {
			printer.write( "is_defined( " );
			prettyPrint( n.variablePath() );
			printer.write( " )" );
		}
	}

	
	public void visit( TypeCastExpressionNode n )
	{
		printer.write( n.type().id() );
		printer.write( "( " );
		prettyPrint( n.expression() );
		printer.write( " )" );
	}

	
	public void visit( SynchronizedStatement n )
	{
		printer.writeLineIndented( "synchronized( " + n.id() + " ) {" );
		printer.indent();
		prettyPrint( n.body() );
		printer.unindent();
		printer.writeIndented( "}" );
	}

	
	public void visit( CurrentHandlerStatement n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( EmbeddedServiceNode n )
	{
		printer.writeLine( "embedded {" );
		char[] stringArray = n.type().toString().toLowerCase().toCharArray();
		stringArray[0] = Character.toUpperCase(stringArray[0]);
		String type = new String(stringArray);
		String embedLine = type + " : \"" + n.servicePath() + "\" in " + n.portId() ; 
		printer.writeLineIndented( embedLine );
		printer.writeLineIndented( "}" );
		printer.writeLine();
	}

	
	public void visit( InstallFixedVariableExpressionNode n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( VariablePathNode n )
	{
		boolean backupShouldPrintQuotes = shouldPrintQuotes;
		shouldPrintQuotes = false;
		Pair< OLSyntaxNode, OLSyntaxNode > node;
		if ( n.isGlobal() ) {
			printer.write( "global." );
		}
		for( int i = 0; i < n.path().size(); i++ ) {
			node = n.path().get( i );
			prettyPrint( node.key() );
			if ( !(node.value() instanceof ConstantIntegerExpression &&
				((ConstantIntegerExpression)node.value()).value() == 0)
			) {
				printer.write( "[" );
				prettyPrint( node.value() );
				printer.write( "]" );
			}
			if ( i < n.path().size() - 1 ) {
				printer.write( "." );
			}
		}
		shouldPrintQuotes = backupShouldPrintQuotes;
	}

	boolean insideType = false;
	
	public void prettyPrint( Range r )
	{
		if ( r.min() == r.max() && r.min() == 1 ) {
			return;
		}
		
		if ( r.min() == 0 && r.max() == 1 ) {
			printer.write( "?" );
		} else if ( r.min() == 0 && r.max() == Integer.MAX_VALUE ) {
			printer.write( "*" );
		} else {
			printer.write( "[" + r.min() + "," + r.max() + "]" );
		}
	}

	
	public void visit( TypeInlineDefinition n )
	{
		if ( insideType == false ) {
			printer.writeIndented( "type " );
		}
		printer.write( n.id() ); 
		prettyPrint( n.cardinality() );
		//printer.write( ":" + n.nativeType().id() );
		if ( n.nativeType().id() == NativeType.RAW.id() ){
			printer.write( ":" + "undefined" );
		} else {
			printer.write( ":" + n.nativeType().id() );
		}
		if ( n.untypedSubTypes() ) {
			printer.write( " { ? }" );
		} else if ( n.hasSubTypes() ) {
			boolean backup = insideType;
			insideType = true;
			printer.writeLine( " {" );
			printer.indent();
			for( Entry< String, TypeDefinition > entry : n.subTypes() ) {
				printer.writeIndented( "." );
				prettyPrint( entry.getValue() );
			}
			printer.unindent();
			printer.writeIndented( "}" );
			insideType = backup;
		}
		printer.writeLine();
		if ( insideType == false ) {
			printer.writeLine();
		}
	}

	
	public void visit( TypeDefinitionLink n )
	{
		// TODO Auto-generated method stub

	}
	
	private void printOperationDeclarations( OperationCollector c )
	{
		Set< Entry< String, OperationDeclaration > > entries = c.operationsMap().entrySet();
		Map< String, OneWayOperationDeclaration > ow = new HashMap< String, OneWayOperationDeclaration >();
		Map< String, RequestResponseOperationDeclaration > rr = new HashMap< String, RequestResponseOperationDeclaration >();
		for( Entry< String, OperationDeclaration > entry : entries ) {
			if ( entry.getValue() instanceof OneWayOperationDeclaration ) {
				ow.put( entry.getValue().id(), (OneWayOperationDeclaration) entry.getValue() );
			} else {
				rr.put( entry.getValue().id(), (RequestResponseOperationDeclaration) entry.getValue() );
			}
		}
		if ( ow.isEmpty() == false ) {
			printer.writeLineIndented( "OneWay:" );
			printer.indent();
			printer.writeIndented( "" );
			int i = 0;
			for( OneWayOperationDeclaration decl : ow.values() ) {
				printer.write( decl.id() );
				if ( decl.requestType() != null ) {
					printer.write( "( " + decl.requestType().id() + " )" );
				}
				if ( i++ < ow.size() - 1 ) {
					printer.write( ", " );
				}
			}
			printer.unindent();
			printer.writeLine();
		}
		if ( rr.isEmpty() == false ) {
			printer.writeLineIndented( "RequestResponse:" );
			printer.indent();
			printer.writeIndented( "" );
			int i = 0;
			for( RequestResponseOperationDeclaration decl : rr.values() ) {
				printer.write( decl.id() );
				if ( decl.requestType() != null ) {
					printer.write( "( " + decl.requestType().id() + " )" );
				}
				if ( decl.responseType() != null ) {
					printer.write( "( " + decl.responseType().id() + " )" );
				}
				if ( i++ < rr.size() - 1 ) {
					printer.write( ", " );
				}
			}
			printer.unindent();
			printer.writeLine();
		}
	}

	
	public void visit( InterfaceDefinition n )
	{
		printer.writeLineIndented( "interface " + n.name() + " {" );
		printOperationDeclarations( n );
		printer.writeLineIndented( "}" );
		printer.writeLine();
	}

	
	public void visit( DocumentationComment n )
	{
		// TODO Auto-generated method stub

	}

	
	public void visit( AddAssignStatement arg0 )
	{
		// TODO Auto-generated method stub
		
	}

	
	public void visit( SubtractAssignStatement arg0 )
	{
		// TODO Auto-generated method stub
		
	}

	
	public void visit( MultiplyAssignStatement arg0 )
	{
		// TODO Auto-generated method stub
		
	}

	
	public void visit( DivideAssignStatement arg0 )
	{
		// TODO Auto-generated method stub
		
	}

	// ATTENTION HACK: USING THIS CLASS FOR SUB-EXPRESSIONS
	public void visit(ConstantDoubleExpression arg0) {
		if( arg0 instanceof SubExpression ){
			SubExpression s = ( SubExpression ) arg0;
			printer.write( "( " );
			prettyPrint( s.getExpressionNode() );
			printer.write( " )");
		} else {
			printer.write( String.valueOf( arg0.value() ) );
		}
	}

	
	public void visit(ConstantBoolExpression n) {
		String b = ( n.value() )? "true" : "false"; 
		printer.write( b );
	}

	
	public void visit(ConstantLongExpression arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void visit( FreshValueExpressionNode arg0 )
	{
		printer.write( "new" );
	}

	
	public void visit( CourierDefinitionNode arg0 ) {
		// TODO Auto-generated method stub
		
	}

	
	public void visit( CourierChoiceStatement arg0 ) {
		// TODO Auto-generated method stub
		
	}

	
	public void visit( NotificationForwardStatement arg0 ) {
		// TODO Auto-generated method stub
		
	}

	
	public void visit( SolicitResponseForwardStatement arg0 ) {
		// TODO Auto-generated method stub
		
	}

	
	public void visit(InterfaceExtenderDefinition arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ForEachSubNodeStatement n) {
		printer.writeIndented( "foreach ( " );
		prettyPrint( n.keyPath() );
		printer.write( " : " );
		prettyPrint( n.targetPath() );
		printer.write( " ){" );		
		printer.writeLine();
		printer.indent();
		prettyPrint( n.body() );
		printer.unindent();	
		printer.writeLine();
		printer.writeIndented("}");
	}

	@Override
	public void visit(ForEachArrayItemStatement arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(InstanceOfExpressionNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(InlineTreeExpressionNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(VoidExpressionNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ProvideUntilStatement arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(TypeChoiceDefinition arg0) {
		// TODO Auto-generated method stub
		
	}

}
