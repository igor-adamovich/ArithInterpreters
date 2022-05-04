package examples.visitor;

import ru.psiras.spec.annotations.Specialize;
import examples.visitor.nodes.arithexpressions.*;
import examples.visitor.nodes.booleanexpression.*;
import examples.visitor.nodes.statements.*;
import examples.visitor.visitor.ASTVisitor;

public class ArithExample {

	@Specialize
	public static final double sqrt(double a, double dEps) {	
		Var vars = new Var('a', a, new Var('x', 1.0, new Var('e', dEps, new Var('d', 0.0, null))));
		
		/* d = a
		 * x = 0.5 * (x + a/x)
		 * while (eps < abs(x - d)) begin
		      d = x
		      x = 0.5 * (x + a/x) 
		 */
	
		Begin whileBegin = new Begin(2, 
				new Assignment('d', new Variable('x'), 
						new Assignment('x', new Mult(new Numeric(0.5), new Sum(new Variable('x'), new Div(new Variable('a'), new Variable('x')))), 
								null)));
		
		While whileSt = new While(new Less(new Variable('e'), new Abs(new Minus(new Variable('x'), new Variable('d')))),
				whileBegin,	
				null);
		
		Assignment wholeStatementsList = new Assignment('d', new Variable('a'), 
				new Assignment('x', new Mult(new Numeric(0.5), new Sum(new Variable('x'), new Div(new Variable('a'), new Variable('x')))), whileSt));
		
		Begin begin = new Begin(3, wholeStatementsList);		

		ASTInterpreter exampleInterpreter = new ASTInterpreter(vars);		
		begin.accept(exampleInterpreter);
		return exampleInterpreter.currentValue;
	}
}
