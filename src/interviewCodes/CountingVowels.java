package interviewCodes;

public class CountingVowels {

	public static void main(String[] args) {

		String str = "I am learning how to code in Java.";
		str = str.toLowerCase();

		int count = 0;
		int vVowel = 0;
		int cCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vVowel++;
			} else if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
				cCount++;
			}
		}
		System.out.println("The total of Vowels are " + vVowel + ".");
		System.out.println("The total of Consonants are " + cCount + ".");
		System.out.println("The total of all Characters are " + count + ".");
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
	}

}
