package classANDobject;

public class Object_StudentAdmision {

	public static void main(String[] args) {
		
		// Students object
		Class_StudentAdmision obj1 = new Class_StudentAdmision("Sohrab", "Safi", 30);
		Class_StudentAdmision obj2 = new Class_StudentAdmision("Milad", "Safi", 25);
		Class_StudentAdmision obj3 = new Class_StudentAdmision("Elham", "Safi", 17);
		Class_StudentAdmision obj4 = new Class_StudentAdmision("Bahar", "Safi", 23);
		
		// create an object for the course
		Course_StudentAdmision java = new Course_StudentAdmision("java", "Coding", 200.45, "3 Months", "Jamil");
		
		// Adding Sudents to the list
		
		java.addstudent(obj1);
		java.addstudent(obj2);
		java.addstudent(obj3);
		java.addstudent(obj4);
		
		
		System.out.println(java);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
