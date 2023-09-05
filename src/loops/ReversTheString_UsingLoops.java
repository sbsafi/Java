package loops;

public class ReversTheString_UsingLoops {

	public static void main(String[] args) {

		
		
		
		// Reverse the String using Loops
		String str = "Test";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);

		
		
		
		
		
	}

}
