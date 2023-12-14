package classANDobject;

public class Class_Computer_1 {

	String name;
	int gb ;
	double size ;
	double price;
	
	
	public  Class_Computer_1() {
		String name = "";
		int gb = 0;
		double size = 0;
		double price = 0;
		
	}
	
	public Class_Computer_1(String newName, int newGb, double newSize, double newPrice) {
		name = newName;
		gb = newGb ;
		size = newSize;
		price = newPrice;
		
	}
	
	public void print_Computer() {
		System.out.println(name);
		System.out.println(gb + " gb");
		System.out.println("$"+price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
