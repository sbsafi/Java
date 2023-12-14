package collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {

		// ArrayList is a calss.
		// ArrayList is flexible in size.
		// Its generic. The type of data that array list can hold.
		// Manupilation is easier with the help of method.
		// We can not use primitive data type but instead we can use a wrapper class.
		// We can store duplicates in ArrayList.

		// How to create an ArrayList?
		// It is called Incetantiate an obejct.

		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Double> decimle = new ArrayList<>();
		ArrayList<Float> fNumbers = new ArrayList<>();
		ArrayList<Object> obj = new ArrayList<>();

		// How to add values in the ArrayList. (add() method)
		ArrayList<String> fruit = new ArrayList<>();

		fruit.add("Apple");
		fruit.add("Mango");

		// How to find the size of the given array?
		System.out.println(fruit.size()); // put it inside print method to show the output.

		// How to access the values in the array?
		String value = fruit.get(0);
		System.out.println(value);

		// More methodes in ArrayList:
		// fruit.addAll(fruit);
		// fruit.clear();
		// fruit.clone();
		// fruit.contains(obj);
		// fruit.isEmpty();
		// fruit.remove(0);
		// fruit.equals(obj);
		// fruit.set(0, value);

		// how to print all the elements of our arraylist ?
		// via looping

		for (int i = 0; i < fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}

		// Printing the list via while loop

		for (String mewa : fruit) {
			System.out.println(mewa);

		}

	}

}
