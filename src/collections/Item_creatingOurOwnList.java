package collections;

import java.util.ArrayList;
import java.util.List;

public class Item_creatingOurOwnList {
	private String name;
	private double price;

	public Item_creatingOurOwnList() {
		super();
		this.name = "";
		this.price = 0;
	}

	public Item_creatingOurOwnList(String name, double price) {
		this();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		String res = "";
		System.out.println("Name: " + name + "\n" + "Price: " + price);
		return res;
	}

	public static void main(String[] args) {
		// Here we create our own list. like encapsulated class.
		
		List<Item_creatingOurOwnList> list = new ArrayList<>();
		Item_creatingOurOwnList apple = new Item_creatingOurOwnList("Apple", 1.99);
		Item_creatingOurOwnList mango = new Item_creatingOurOwnList("Mango", 1.77);
		
		list.add(apple);
		list.add(mango);
		System.out.println(list);
	}

}
