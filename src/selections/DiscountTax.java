package selections;

public class DiscountTax {

	public static void main(String[] args) {

		// Create a double name = discount
		// create a String name = Full Name
		// Create an int name = age
		// Create a char name = gender
		// Create a double name = total
		// Create a double name = discountamount

		// We are going to calculate the discount based on the age of the customer
		// if the customer is a female between age 22-35 then we give them 10% discount
		// if the customer is a male between 22-35 them we give them 5% dicount
		// if the customer is a female above 60. then we give her 25% discount
		// if the customer is a male above 60, then we give him 20% dicount
		// if the customer is a female between 50-55 we give her 10% discount
		// if the customer is a male between 50-55 we give him 8% discount
		// anything else , no discount.

		// Calculate the discount based on the valuse of the variables
		// print the total before the discount
		// print the discount amount
		// print the total after discount

		// Note : How to calculate a percentage ?
		// Ans : total of the amount * percent / 100

		// -------------------------------------------------------------------------------------------------------

		String name = "Sohrab Safi";
		int age = 60;
		char gender = 'm';
		double total = 1300.88;
		double discountedamount = 0; // total of the amount * percent / 100
		double discount = 0.5;

		if (gender == 'f' && (age >= 22 && age <= 35)) {
			// if the customer is a female between age 22-35 then we give them 10% discount
			discount = 0.10;
		} else if (gender == 'm' && (age >= 22 && age <= 35)) {
			// if the customer is a male between 22-35 them we give them 5% dicount
			discount = 0.5;
		} else if (gender == 'f' && age >= 60) {
			// if the customer is a female above 60. then we give her 25% discount
			discount = 0.25;
		} else if (gender == 'm' && age >= 60) {
			// if the customer is a male above 60. then we give her 25% discount
			discount = 0.20;
		} else if (gender == 'f' && (age >= 50 && age <= 55)) {
			// if the customer is a female between 50-55 we give her 10% discount
			discount = 0.10;
		} else if (gender == 'm' && (age >= 50 && age <= 55)) {
			// if the customer is a male between 50-55 we give her 10% discount
			discount = 0.8;
		} else {
			discount = 0;
		}
		discountedamount = total * discount;
		System.out.println( "Customer's Name: " + name + "\nCustomer's age: " + age);
		System.out.println("Total: " +"$"+ total);
		System.out.println("Customer's discount: " + discount + "%");
		System.out.println("Total after discount: " +"$" +  discountedamount);

	}

}
