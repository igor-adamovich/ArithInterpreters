package examples.visitor.nodes.statements;

import examples.visitor.nodes.arithexpressions.ArithExpression;
import examples.visitor.visitor.ASTVisitor;

public class Assignment extends Statement{
	public char left;
	public ArithExpression right;
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public Assignment(char left, ArithExpression right, Statement nextStatement) {
		this.left = left;
		this.right = right;
		this.nextStatement = nextStatement;
	}
}
