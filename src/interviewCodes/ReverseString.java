package interviewCodes;

public class ReverseString {

	public static void main(String[] args) {

		String str = "This is a test";
		System.out.println(resvers(str));

	}

	public static String resvers(String str) {
		StringBuilder sb = new StringBuilder(str);
		return String.valueOf(sb.reverse());
	}

}
