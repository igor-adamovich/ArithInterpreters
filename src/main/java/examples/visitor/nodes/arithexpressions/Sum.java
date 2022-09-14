package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Sum extends ArithOperator {

	public Sum(ArithExpression left, ArithExpression right) {
		super(left, right);
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
