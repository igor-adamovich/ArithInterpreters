package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public abstract class ArithOperator extends ArithExpression{
	public ArithExpression left;
	public ArithExpression right;
	
	public ArithOperator(ArithExpression left, ArithExpression right) {
		this.left = left;
		this.right = right;
	}	
}
