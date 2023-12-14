package inheritance;

public class Runner {
	// Main method to run our code
	public static void main(String[] args) {

		person p1 = new person("Sohrab Safi", "sb.safi@gmail.com", 30);
		System.out.println(p1);
		p1.setFullName("Milad Safi"); // here we changed the old name to new name 
		System.out.println(p1);

		
		
		Instructors ins = new Instructors("Java Teacher");
		System.out.println(ins);
		
		Students stu2 = new Students(122, 30.00);
		System.out.println(stu2);
		
		
		
		
		
		
		
		
		
		
	}	

}
