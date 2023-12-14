package collections;

import java.util.HashMap;

public class HashMapExamples {

	public static void main(String[] args) {

		// HashMap has Key & Value.
		// key should be uniqu while Value can be vary.

		HashMap<Integer, String> names = new HashMap<Integer, String>();
		// To add some values.
		// you have to use the method .put() to add some values in the HashMap:

		names.put(1, "Sohrab");
		names.put(2, "Milad");
		names.put(3, "Elham");
		names.put(4, "Navid");

		System.out.println(names);

		// Getting the values from HashMam
		System.out.println("Getting the value: " + names.get(3));

		// Getting all of the keys
		// .keySet() method wil return all the keys for you.
		System.out.println(names.keySet());

		// .values() method gives you all of the values from the map.
		System.out.println(names.values());

		// .containsKey() will return true/false if the key is present in the map or
		// not.
		System.out.println(names.containsKey(2));

		// .containsValue() will return true/false if the value is exists or no.
		System.out.println(names.containsValue("Sohrab"));

		// .empty() method will check if the map is empty or not and returns true/false.
		System.out.println(names.isEmpty());

		System.out.println("****************************************************");

		// how to iterate HashMap
		// to iterate through a map, you need get the keys of the map.
		// then go through the keys, and use each key with the get method.
		// method keySet is going to to give you a set, so you can use for each loop for
		// that.
		for (Integer key : names.keySet()) {
			System.out.println("Key: " + key + ", Value: " + names.get(key));
		}

		System.out.println("****************************************************");

	}
}
