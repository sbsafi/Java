package encasulation_banking;

public class class_Customer_1 {
	// Encapulation - is the idea of hidding your variables and defining control.
	// you do this by making ther variables private and then making the accessable
	// through getMethod and setMethod.

	private String fullName;
	private String phoneNumber;
	private String address;
	private String email;
	private String dob;
	private String pin;
	private double balance;
	private int accNumber;

	public class_Customer_1() {
		this.fullName = "";
		this.phoneNumber = "";
		this.address = "";
		this.email = "";
		this.dob = "";
		this.pin = "";
		this.balance = 0;
		this.accNumber = 0;

	}

	public class_Customer_1(String fullName, String phoneNumber, String address, String email, String dob,
			double balance, int accNumber, String pin) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.balance = balance;
		this.accNumber = accNumber;
		this.pin = pin;
	}

	public String toString() {
		System.out.println("----------------------------------------------------------------------");

		return "FullName: " + fullName + ", PhoneNumber: " + phoneNumber + "\nAddress: " + address + ", Email: " + email
				+ "\nDOB: " + dob + ", Balance: " + balance + "\nAccount-Number: " + accNumber;

	}

	public String getFullName() { // Getter/ Accessors - methods to access the private variables
		return fullName;
	}

	public void setPhoneNumber(String phoneNumber) { // Setters / Mutators - methods are used to change or update the
														// value.
		this.phoneNumber = phoneNumber; // pass the value you want to update inside paranthese as parameter.
										// No return type.
	}

	public double checkBlance(String providePIN) {
		if (pin.equals(providePIN)) {
			System.out.println("Your balance is: $" + balance);
			return balance;
		} else
			System.out.println("Wrong pin !");
		return -1;
	}

	// To deposit some amount.
	public boolean deposit(double amount, int accNumber, String pin) {
		if (this.accNumber != accNumber || !this.pin.equals(pin)) {
			System.out.println("Wrong Information!");
			return false;
		}
		this.balance += amount;
		return true;
	}

	// To withdraw some amount.
	public double withdraw(double amount, String pin) {
		if (this.pin.equals(pin) == false) {
			System.out.println("Wrong PIN!");
			return -1;
		}

		if (amount > balance) {
			System.out.println("Incuffiecient Balance!");
			return -1;
		}

		System.out.println("$" + amount + " has been withdrawn from your account.");
		amount -= balance;
		return amount;

	}

}
