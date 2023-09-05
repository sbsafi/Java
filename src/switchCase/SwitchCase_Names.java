package switchCase;

public class SwitchCase_Names {
	public static void main(String[] args) {

		// Create a char startsWith and assign a letter
		// a, b, c, d, e, f
		// create a switch case that prints a name that starts with that character
		// now create an if-statements to do the same function

		char startsWith = 'A';

		switch (startsWith) {
		case 'A':
			System.out.println("Ahmad");
			break;
		case 'B':
			System.out.println("Bahram");
			break;
		case 'C':
			System.out.println("Cat");
			break;
		case 'D':
			System.out.println("David");
			break;
		case 'E':
			System.out.println("Elham");
			break;
		case 'F':
			System.out.println("Farhad");
			break;
		default:
			System.out.println("The letter is out of the range.");

		}

		// if-statement

		if (startsWith == 'A') {
			System.out.println("Ashraf");

		} else if (startsWith == 'B') {
			System.out.println("Bashir");

		} else {
			System.out.println("The letter you mentioned is out of the range.");
		}

	}
}
