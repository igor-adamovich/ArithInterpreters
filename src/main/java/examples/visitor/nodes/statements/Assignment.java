package examples.visitor.nodes.statements;

import examples.visitor.nodes.arithexpressions.ArithExpression;
import examples.visitor.visitor.ASTVisitor;

public class Assignment extends Statement{
	public char left;
	public ArithExpression right;

	public Assignment(char left, ArithExpression right, Statement nextStatement) {
		this.left = left;
		this.right = right;
		this.nextStatement = nextStatement;
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
