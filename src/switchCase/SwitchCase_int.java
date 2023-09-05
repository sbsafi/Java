package switchCase;

public class SwitchCase_int {
	public static void main(String[] args) {

		int numberOfCutomers = 2 ;

		switch (numberOfCutomers) {
		case 1:
			System.out.println("Small Table");
			break;
		case 2:
			System.out.println("Meduim Table");
			break;
		case 5:
			System.out.println("Large Table");
			break;
		default:
			System.out.println("Combine tables");

		}

	}
}
