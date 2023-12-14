package classANDobject;

public class Class_StudentAdmision {
	String firstName;
	String lastName;
	int age;

	public Class_StudentAdmision() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;

	}
	
	// This keyword refres to the current class scope.
	public Class_StudentAdmision(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	public String toString() {
		
		return "Student [ " + firstName + ", " + lastName + ", " + age +"yr old" + "]";
	}

}
