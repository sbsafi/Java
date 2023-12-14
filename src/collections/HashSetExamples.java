package collections;

import java.util.HashSet;

public class HashSetExamples {

	public static void main(String[] args) {
		// You can not have duplicates in a Set / or you can have only one of each
		// values.
		// you have same methodes like ArrayList and LinkedList here in HashSet as well.
		// HashSet is an unordered collection.

		HashSet<Integer> temp = new HashSet<>();
		temp.add(1);
		temp.add(33);
		temp.add(30);
		temp.add(1);

		System.out.println(temp);
		// HashSet doesnt have .get() method to retrive a value but we can use
		// .contains() method.

		System.out.println(temp.contains(33)); // write any value in the ( ) that you wanna find out
												// exists or not.
												// retuen True or False.
		
		// How to iterate HashSet?
		// one option - you can use for each loop.
		for(Integer integer: temp) {
			System.out.println(integer);
			
		}
	}

}
