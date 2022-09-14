package examples.visitor.nodes.booleanexpression;

import examples.visitor.nodes.arithexpressions.ArithExpression;
import examples.visitor.visitor.ASTVisitor;

public class Less extends BooleanOperator {

	public Less(ArithExpression left, ArithExpression right) {
		super(left, right);
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
