package loops;

public class While_Loop_Vowels {

	public static void main(String[] args) {
		
		// Interview Questions 
		
		// Count the vowels 
		
		String str = "this is a test";
		
		int count = 0; // this is gonna count the vowels
		int i = 0; // this is gonna count the length of the text
		while (i < str.length()) {
			char c = str.charAt(i++);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				++count;
			}
		}
		
		System.out.println("we have " + count + " vowels charachters in the given String.");
		
		

	}

}
