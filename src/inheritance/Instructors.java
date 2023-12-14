package inheritance;

public class Instructors extends person {
	// Child Class or Sub Class
	private String major;

	public Instructors() {
		super();
		this.major = "";
	}

	public Instructors(String major) {
		super();
		this.major = major;
	}

	public String toString() {
		return "[Major: " + major + "]";
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String NewMajor) {
		this.major = NewMajor;

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
