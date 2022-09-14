package examples.visitor.nodes.statements;

import examples.visitor.nodes.ASTNode;
import examples.visitor.visitor.ASTVisitor;

public class Begin extends ASTNode {
	public int size;
	public Statement statements;

	public Begin(int size, Statement statements) {
		this.size = size;
		this.statements = statements;
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
