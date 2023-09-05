package arrayList;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {

		// Advantages of ArrayList

		// Dynamic in size
		// it has pre-developed function that you can use
		// ArrayList is a class from collection package
		// Inside <> we must use the refrence data types not primitive data types

		ArrayList<String> names = new ArrayList<String>();

		// To add elements
		names.add("Sohrab");
		names.add("Masih");
		
		
		
		// to print the ArrayList through loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// To print the ArrayList simply we can use the name of the list
		System.out.println(names);

		// to print the size of the ArrayList
		System.out.println(names.size());

		// To print a spicifc element vai index
		System.out.println(names.get(0));

		// To replace an element
		names.set(0, "Bahar");

		// To clear the list
		names.clear();

	}

}
