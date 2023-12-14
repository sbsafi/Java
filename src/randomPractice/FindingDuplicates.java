package randomPractice;

import java.util.HashSet;

public class FindingDuplicates {

	public static void main(String[] args) {

		String arr[] = { "sohrab", "Milad", "Sohrab" };
		System.out.println(hasDuplicate(arr));
	}

	public static boolean hasDuplicate(String[] str) {
		HashSet<String> temp = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			if (temp.add(str[i]) == false) {
				return true;
			}
		}
		return false;
	}
}
