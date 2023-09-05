package selections;

public class If_else_Statements {

	public static void main(String[] args) {

		// Widthraw the money

		double balance = 400;
		double widthraw = 100;

		if (widthraw <= balance) {
			System.out.println("Sufficient balance : " + widthraw); // First block of code is called True Statement

		} else {
			System.out.println("Incufficient balanace :" + (balance - widthraw)); // seconds block of code is called
																					// False statment

		}

		
		
		System.out.println("_____________________________________________________________________________________");
		
		
		
		
		
		
		
	
		int pinStored = 1234;
		int pinEntred = 1234;

		if (pinStored == pinEntred) {
			System.out.println("Unlock the phone !");

		} else {
			System.out.println("Wrong Password !");

		}

	}

}
