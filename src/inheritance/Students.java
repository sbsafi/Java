package inheritance;

public class Students extends person {
	// Child Class or Sub Class

	private int studentsID;
	private double gpa;

	public Students() {
		super(); // here this super keywrod refers to the parent class.
					// control and click on it and it takes you to the parent class
					// It takes you to the default constructor.
		this.studentsID = 0;
		this.gpa = 0;
	}

	public Students(int studentsID, double gpa) {
		super();
		this.studentsID = studentsID;
		this.gpa = gpa;
	}

	public int getStudentID() {
		return studentsID;
	}

	public void setStudentID(int newStudentID) {
		this.studentsID = newStudentID;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double newgpa) {
		this.gpa = newgpa;
	}

	public String toString() {
		return "[Student ID:" +studentsID + ", Gpa: " + gpa + "]";

	}

}

// 'super' is like 'this' keyword
// this = refers to the current class
// super = refers to the immediate parent class

/*
 * Constructor Chaining by using 'super ();' keyword calling another constructor
 * at the begining of your constructor it must be at the first statment in your
 * constructor you can match the signature of any current or super class
 * constructor we use either 'this' or 'super'
 */