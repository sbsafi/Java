package inheritance;

public class person {
	// Parent Class
	private String fullName;
	private String email;
	private int age;
	String address;

	// The job of the constructor is to initialize all of the variables of the
	// class.
	public person() {
		this.fullName = "";
		this.email = "";
		this.age = 0;
		this.address = "";

	}

	public person(String fullName, String email, int age) {
		this();
		this.fullName = fullName;
		this.email = email;
		this.age = age;
	}

	public String toString() {
		return "[Full Name: " + fullName + ", email: " + email + ", age: " + age + "]";
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public void setFullName(String newName) {
		this.fullName = newName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
//'super' is like 'this' keyword
//this = refers to the current class
//super = refers to the immediate parent class

/*
 * Constructor Chaining calling another constructor at the begining of your
 * constructor it must be at the first statment in your constructor you can
 * match the signature of any current or super class constructor we use either
 * 'this' or 'super'
 */
