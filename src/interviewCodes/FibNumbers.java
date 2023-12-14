package interviewCodes;

import java.util.ArrayList;

public class FibNumbers {

	public static void main(String[] args) {

		// Fib Numbers

		int count = 5;
		// Creating an arraylist to keep the fib numbers 
		ArrayList<Integer> fib = new ArrayList<Integer>();
		
		// Adding the fib numbers
		fib.add(0);
		fib.add(1);

		for (int i = 0; i < count - 2; i++) {
			// getting the two previous index and adding them
			int sum = fib.get(i) + fib.get(i + 1);
			// adding the new fib number to the list
			fib.add(sum);
		}

		// Printing the list of fib numbers
		System.out.println(fib);

	}

}
