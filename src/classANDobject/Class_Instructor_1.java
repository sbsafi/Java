package classANDobject;

public class Class_Instructor_1 {

	// Creating the variables here

	String firstName;
	String lastName;
	int age;
	double salary;
	String subject;

	// Creating the default constructor
	public Class_Instructor_1() {
		firstName = "";
		lastName = "";
		age = 0;
		salary = 0;
		subject = "";

	}

	// Creating the Paramertized constructor
	public Class_Instructor_1(String fName, String lName, int agee, double sal, String sub) {
		firstName = fName;
		lastName = lName;
		age = agee;
		salary = sal;
		subject = sub;

	}

}
