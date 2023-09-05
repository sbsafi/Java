package loops;

public class ForLoopExample_1 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// Interview Question using For Loop

		String str = "dad";
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		// Now we want to see if they are palindrome or no using If Statment.
     
		if (str.equals(rev)) {
			System.out.println("Yes, it is Palindrome");

		} else {
			System.out.println("No, it is not palindrome");
		}
		System.out.println(str);
		System.out.println(rev);
	}
}
