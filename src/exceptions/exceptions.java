package exceptions;

public class exceptions {

	public static void main(String[] args) {

		// 1 . Exceprion :
		// Events that are planned and going to stop the execution.
		// user-defined, the ones that developers can create.
		// pre-defined, the ones coming with the JDK or nay tools that you use

		/*
		 * 
		 * int a = 10; int b = 0; System.out.println(a/b); // After running the code it
		 * gives us an arithmatic exception.
		 * 
		 * String x = null; System.out.println(x.charAt(0)); // It gives us an exception
		 * NullPointerException.
		 *
		 * 
		 */

		// 2. handling Exceprion
		// a - try/catch
		// b - throws
		
		
		// checked vs unchecked 
		// checked - you will be forced to handle the exception that may occure
		// it is mandatory to handle the checked exception
		
		
		// unchecked - its optional for you to handle the exception
		
		
		// throws vs throw
		// throw is a way to handle exceptions. it basically passes the responsibilty of handling a checked exception
		// of a code that you have in a method to the caller of that method.
		
		// throw is keyword that we can use to run/call an exception.
		
		

		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ex) {
			System.out.println("You can not divid 0 by 10.");
		} 

	}

}
