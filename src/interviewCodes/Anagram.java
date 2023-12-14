package interviewCodes;

public class Anagram {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=oa0wxvoZPDI&ab_channel=ABC-TechnologyTraining%26Upskilling
		// https://www.youtube.com/watch?v=IRN1VcA8CGc&ab_channel=NickWhite

		String s = "anagram";
		String y = "nagaram";
		if (s.length() != y.length());
		
		int[] char_count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char_count[s.charAt(i)-'a']++;
			char_count[y.charAt(i)-'a']--;
			
		}
		
		for ( int count: char_count) {
			if(count != 0) {
				System.out.println("False,it is not anagaram");
			}
		}
		 System.out.println("True, This is anagaram");
		

	}

}
