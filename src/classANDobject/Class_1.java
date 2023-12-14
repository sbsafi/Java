package classANDobject;

public class Class_1 {

	// Here we create a class without the main method
	// This class is our blue print
	// Class has 2 members
	// 1 - Variables
	// 2 - Methodes

	// This is the variables and they store the data that you want in your template
	String firstName;
	String lastName;
	int age;

	// 2 - Methodes are two types {Methodes and Constructors}.

	// 1- Constructors
	// Constructors are used to create an object of the class.
	// The job of the constructor is to initialize all of the variables of the
	// class.
	public Class_1() {
		firstName = "";
		lastName = "";
		age = 0;
		System.out.println("I called the constructor"); // This is just an example
	}
		// 2- Mehtodes --> are used to perform some actions on that object.
		public void printinfo() {
			System.out.println(firstName +", " + lastName +", " +  age);
			
		}
	}

