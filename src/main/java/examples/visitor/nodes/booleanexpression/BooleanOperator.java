package examples.visitor.nodes.booleanexpression;

import examples.visitor.nodes.arithexpressions.ArithExpression;
import examples.visitor.visitor.ASTVisitor;

public abstract class BooleanOperator extends BooleanExpression{
	public ArithExpression left;
	public ArithExpression right;

	public BooleanOperator(ArithExpression left, ArithExpression right) {
		this.left = left;
		this.right = right;
	}
	
	
}
