package randomPractice;

import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {

		// Find the duplicates in the given array

		String[] names = { "Sohrab", "Milad", "Elham", "Bahar", "Sohrab" };
		int[] numbers = { 1, 2, 45, 6, 1, 6 };
		System.out.println(hasDuplicate(names));
		System.out.println(hasDuplicate_int(numbers));

	}

	public static boolean hasDuplicate(String[] str) {
		HashSet<String> temp = new HashSet<>();
		for (int i = 0; i < str.length; i++) {
			if (temp.add(str[i]) == false) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasDuplicate_int(int[] nums) {
		HashSet<Integer> temp = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (temp.add(nums[i]) == false) {
				return true;
			}
		}
		return false;
	}
}
