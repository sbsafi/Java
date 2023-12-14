package classANDobject;

public class Object_Instructor_1 {

	public static void main(String[] args) {
		// Creating the object for calss Instructor

		// Defualt constructor
		Class_Instructor_1 obj1 = new Class_Instructor_1();
		obj1.firstName = "Sohrab";
		obj1.lastName = "Safi";
		obj1.age = 30;
		obj1.salary = 120;
		obj1.subject = "Java Instructor";

		System.out.println(obj1.firstName);
		System.out.println("$" +obj1.salary );
		
		
		
		// Creating the parametrized constructor
		Class_Instructor_1 obj2 = new Class_Instructor_1("Anna", "Wilson", 20, 130.0 ,  "Math");
		System.out.println(obj2.age);

		
		
	}

}
