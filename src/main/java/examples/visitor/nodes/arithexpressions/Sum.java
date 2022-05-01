package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Sum extends ArithOperator {

	public Sum(ArithExpression left, ArithExpression right) {
		super(left, right);
	}
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}
}
