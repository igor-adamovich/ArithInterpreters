package examples.visitor.nodes.booleanexpression;

import examples.visitor.nodes.arithexpressions.ArithExpression;
import examples.visitor.visitor.ASTVisitor;

public class LessEquals extends BooleanOperator {

	public LessEquals(ArithExpression left, ArithExpression right) {
		super(left, right);
	}
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}
}
