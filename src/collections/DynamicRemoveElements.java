package collections;

import java.util.ArrayList;

public class DynamicRemoveElements {

	public static void main(String[] args) {

		ArrayList<String> fruit = new ArrayList<>();

		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Appricot");
		fruit.add("Watermelon");

		// Write a code to remove all the elements that start with letter A.
		for (int i = 0; i < fruit.size(); i++) {
			if (fruit.get(i).startsWith("A")) {
				fruit.remove(i);

			}
		}
		for (String mewa : fruit) {
			System.out.println(mewa);
		}
	}

}
