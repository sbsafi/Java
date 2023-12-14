package exceptions;

public class Try_Catch2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		String country = "Afghanistan";

		try {
			System.out.println(a / b);
			System.out.println(country.charAt(20));
		} catch (ArithmeticException e) {
			System.out.println("This is ArithmeticException."); // it is good to writh the exceptions accoding to the variables or in order.
		} catch (StringIndexOutOfBoundsException e) { // We can write as many catches we want.
			System.out.println("This is StringIndexOutOfBoundryException.");
		} finally { // Finally is a keyword and prints at the end.
			System.out.println("Finally prints at the end.");

		}
	}

}
