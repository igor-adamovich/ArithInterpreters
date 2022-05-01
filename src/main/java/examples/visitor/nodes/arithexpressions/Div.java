package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Div extends ArithOperator {

	public Div(ArithExpression left, ArithExpression right) {
		super(left, right);
	}
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}
}
