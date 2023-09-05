package selections;

public class If_Else_Practice {
	public static void main(String[] args) {

		int pinStored = 1234;
		int pinEntred = 1234;
		double balance = 600;
		double widthraw = 800;

		if (pinStored == pinEntred && widthraw <= balance) {
			System.out.println("Open the account and widthraw the ammount." + (widthraw - balance));
		} else {
			System.out.println("Wrong Information and try again.");

		}

	}

}
