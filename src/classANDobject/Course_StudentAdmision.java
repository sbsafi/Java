package classANDobject;

import java.util.ArrayList;

public class Course_StudentAdmision {
	String title ;
	String description;
	double fees;
	String duration;
	String instructor;
	ArrayList<Class_StudentAdmision> students; // We chose ArrayList cuz ther is no limit in storing. better than List.
	
	public Course_StudentAdmision() {
		this.title = "";
		this.description = "";
		this.duration = "";
		this.fees = 0;
		this.instructor = "";
		this.students = new ArrayList<Class_StudentAdmision>();
	}
	
	public Course_StudentAdmision(String title, String description, double fees, String duration, String instructor) {
		this.title = title;
		this.description = description;
		this.fees = fees;
		this.duration = duration;
		this.instructor = instructor;
		this.students = new ArrayList<Class_StudentAdmision>();
		
	}
	
	public void addstudent(Class_StudentAdmision stu) {
		 students.add(stu);
		
	}

	public String toString() {
		String temp = "";
		temp += "Title: " + title + "\n";
		temp += "Description: " + description + "\n";
		temp += "Duration: " + duration + "\n";
		
		for (Class_StudentAdmision stu : students) {
			temp += stu.toString() + "\n";
 	
		}
		return temp;
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
