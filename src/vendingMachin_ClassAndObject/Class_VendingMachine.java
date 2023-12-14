package vendingMachin_ClassAndObject;

public class Class_VendingMachine {

	String name;
	int qty;
	double price;

	public Class_VendingMachine() {
		name = "";
		qty = 0;
		price = 0;
	}

	public void printinfo() {
		System.out.println("Product information [Name: " + name + ", Quantity: " + qty + ", Price: " + "$" + price);

	}

	public void dispense() {
		// we wanna decrease the qty and print a receipt
		// check if the qty > 1 then despense
		if (qty > 0) {
			qty--;
			System.out.println("Item sold");
			printinfo();
		} else {
			System.out.println("Sorry, " + name + " is out of stock.");
		}
	}

	public int reStock(int newItem) {
		qty = qty + newItem;
		System.out.println(qty + " " +  name +  " is added to the stock.");
		return qty;
	}

	public Class_VendingMachine(String Newname, int NewQty, double NewPrice) {
		name = Newname;
		qty = NewQty;
		price = NewPrice;

	}

}
