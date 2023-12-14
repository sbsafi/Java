package dimention_Collection;

import java.util.HashMap;
import java.util.ArrayList;

public class DimCollection {

	public static void main(String[] args) {
		// created a HashMap of String with ArrayList of Strings.
		HashMap<String, ArrayList<String>> students = new HashMap<>();
		students.put("Panthers", new ArrayList<String>());
		
		// How to get to the Array? pass the key name inside ( );
		System.out.println(students.get("Panthers")); // ===> prints empty cuz there is nothing added to the list.
		System.out.println(students); // prints the Map whith no value.
		
		
		// how to add values to the ArrayList?
		students.get("Panthers").add("Sohrab"); // Index 0
		students.get("Panthers").add("Milad");  // Index 1
		students.get("Panthers").add("Elham");  // Index 2
		students.get("Panthers").add("Karim");  // Index 3
 		students.get("Panthers").add("Tawab");  // Index 4
		System.out.println(students);
		
		
		// How to get a specific value from the ArrayList?
		// since ArrayList is designed through index, we can find the value by index.
		System.out.println(students.get("Panthers").get(0)); // ====> Sohrab
		
		
		// We can create more Maps.
		students.put("Titans", new ArrayList<String>());
		students.put("Phonex", new ArrayList<String>());
		students.put("Dragon", new ArrayList<String>());
		
		
		
		
		
	}

}
