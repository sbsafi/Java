package classANDobject;

public class Object_vehicle_1 {

	public static void main(String[] args) {
		Class_vehicle_1 obj1 = new Class_vehicle_1();
		obj1.model = "camry";
		obj1.make = "Toyota";
		obj1.color = "Silver";
		obj1.licensePlate = "JJB1345";
		obj1.price = 120.00;

//		System.out.println("Color: " + obj1.color);
//		System.out.println("LicensePlate: " + obj1.licensePlate);

		Class_vehicle_1 obj2 = new Class_vehicle_1("Hunda", "4D", 30.00, "BLK", "JJ3344");
//		System.out.println("Make: " + obj2.make);
//		System.out.println("Color: " + obj2.color);
		
		
		System.out.println(obj1);
		System.out.println();
		System.out.println(obj2);
		

	}

}
