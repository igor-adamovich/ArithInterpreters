package examples.visitor.visitor;

import examples.visitor.nodes.arithexpressions.*;
import examples.visitor.nodes.booleanexpression.*;
import examples.visitor.nodes.statements.*;

public abstract class ASTVisitor {
	public abstract void visit(Assignment st);
	public abstract void visit(Begin st);
	public abstract void visit(While st);
	
	public abstract void visit(Abs expr);
	public abstract void visit(Numeric expr);
	public abstract void visit(Variable expr);
	public abstract void visit(Div expr);
	public abstract void visit(Minus expr);
	public abstract void visit(Mult expr);
	public abstract void visit(Sum expr);
	
	public abstract void visit(BooleanValue expr);
	public abstract void visit(Equals expr);
	public abstract void visit(Greater expr);
	public abstract void visit(GreaterEquals expr);
	public abstract void visit(Less expr);
	public abstract void visit(LessEquals expr);
}
