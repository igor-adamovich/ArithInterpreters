package examples.descend;

public class Testing {
	public static void main(String[] args) {
		test();
	}
	static void test() {
		double eps = 0.01;

		double origRes =  examples.descend.ArithExample.sqrt(8, eps);
		System.out.println("Result of original program = " + origRes);
	
		double specRes =  examples.descend.spec.ArithExample.sqrt(8, eps);
		System.out.println("Specialized result =" + specRes);
		
		System.out.println("Results are equal = " + (origRes == specRes));
	}
}
