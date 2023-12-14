package vendingMachin_ClassAndObject;

public class Object_VendingMachine {

	public static void main(String[] args) {
		Class_VendingMachine obj = new Class_VendingMachine();
		obj.name = "Lays";
		obj.price = 3.0;
		obj.qty = 10;
		obj.printinfo();
		System.out.println();
		Class_VendingMachine obj2 = new Class_VendingMachine();
		obj2.name = "M&M";
		obj2.price = 2;
		obj2.qty = 20;
		obj2.printinfo();
		System.out.println();
		
		
		Class_VendingMachine obj3 = new Class_VendingMachine("Coffee", 2 , 5);
		obj3.printinfo();
		obj3.reStock(3);
		obj3.printinfo();
		System.out.println();
		
		
		Class_VendingMachine obj4 = new Class_VendingMachine("Kitkat", 2, 3);
		obj4.printinfo();
		obj4.dispense();
		obj4.dispense();
		obj4.dispense();
		obj4.reStock(4);
		obj4.printinfo();
		
		
		
	}

}
