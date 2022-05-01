package examples.visitor.nodes.booleanexpression;

import examples.visitor.nodes.arithexpressions.ArithExpression;
import examples.visitor.visitor.ASTVisitor;

public class Greater extends BooleanOperator {

	public Greater(ArithExpression left, ArithExpression right) {
		super(left, right);
	}
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}
}
