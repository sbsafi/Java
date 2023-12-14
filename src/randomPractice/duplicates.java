package randomPractice;

public class duplicates {

	public static void main(String[] args) {
		// Find the duplicate word in the given String array

		String[] str = { "Java", "C++", "Python", "C++" };
		int[] nums = { 12, 4, 5, 12, 44 };
		int[] nums1 = { 12, 4, 5, 12, 44 };
		System.out.println(hasDuplicate(str));
		System.out.println(hasDuplicates(nums));
		System.out.println(hasDuplicates(nums1));
		

	}

	public static boolean hasDuplicate(String[] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println(str[i]);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasDuplicates(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
					return true;
				}
			}
		}
		return false;
	}

}
