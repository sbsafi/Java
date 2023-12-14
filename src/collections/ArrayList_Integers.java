package collections;

import java.util.ArrayList;

public class ArrayList_Integers {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(100);
		numbers.add(1231);
		numbers.add(321);
		numbers.add(32);
		numbers.add(2124);
		
		
		// find the sum of the numbers in the array list?
		
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		
		System.out.println("Total: " + sum);
		
	}

}
