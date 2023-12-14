package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_replit2 {

	public static void main(String[] args) {
		// Creat 2 arraylist first numbers and second alphabet [1, 2, 3, 4] [A, B, C, D]
		// print arraylist
		// copy alohabet arraylist and paste in numer arraylist
		// print both arraylist
		// Expected output
		// List1: [1, 2, 3, 4]
		// List2: [A, B, C, D]
		// After copy:
		// List1: [A, B, C, D]
		// List2: [A, B, C, D]

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		ArrayList<Character> chars = new ArrayList<Character>();
		chars.add('A');
		chars.add('B');
		chars.add('C');
		chars.add('D');
		System.out.println("List1: " + nums);
		System.out.println("List2: " + chars);
		
		// Continue the code here 
		

	}

}
