package collections;

import java.util.HashSet;

public class InterviewQA {

	public static void main(String[] args) {
		// Find if there is a duplicate in the given array.

		int[] numbers = { 12, 34, 34, 4, 3, 45, 1, 12, 4 };
		int [] num = {1,2,3,4,5};
		System.out.println(hasDuplicate(numbers));
		System.out.println(hasDuplaicate_Set(numbers));
		System.out.println(hasDuplaicate_Set(num));
		System.out.println(hasDuplicate(num));
	}

	// Create a method.
	public static boolean hasDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}

			}
		}
		return false;
	}
	// Creating a method and adding/using HashSet
	public static boolean hasDuplaicate_Set(int[] nums) {
		HashSet<Integer> temp = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (temp.add(nums[i]) == false) {
				return true;
			}
		}

		return false;
	}
}
