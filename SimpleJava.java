
import acm.program.*;

public class SimpleJava extends ConsoleProgram {
	
	/* Max term limit set to 10,000*/
	private static final int MAX_TERM_VALUE = 10000; 

	/* We want to execute a statement describing what the code will
	 * execute before creating an algo listing the Fibonacci Sequence.
	 * Also, I don't know how many times the Fibonacci Sequence will run 
	 * to get to the MAX_TERM_VALUE, so I will opt for a While Loop
	 * over a For Loop
	 */
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int f0 = 0;  // fib(0) must equal 0, so f0 will first reflect this value 
		int f1 = 1;  // We need to define fib(1) to equal f1 for the same purposes
		while (f0 <= MAX_TERM_VALUE) {
			println(f0); // First int print
			int term = f0 + f1; // Setting up Fibonacci Sequence formula
			f0 = f1;  //Changing initial value to reflect following value
			f1 = term; // Same reason as note above
		}
		
	}
}
