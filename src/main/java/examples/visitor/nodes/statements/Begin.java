package examples.visitor.nodes.statements;

import examples.visitor.nodes.ASTNode;
import examples.visitor.visitor.ASTVisitor;

public class Begin extends ASTNode {
	public int size;
	public Statement statements;
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public Begin(int size, Statement statements) {
		this.size = size;
		this.statements = statements;
	}
}
