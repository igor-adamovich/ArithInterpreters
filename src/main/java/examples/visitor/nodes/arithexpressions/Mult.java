package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Mult extends ArithOperator {

	public Mult(ArithExpression left, ArithExpression right) {
		super(left, right);
	}
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}
}
