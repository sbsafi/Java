package exceptions;

public class Try_Catch1 {

	public static void main(String[] args) {
		
		
		String name = "Sohrab";
		try {
		System.out.println(name.charAt(9));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("There are only 5 indexex.");
		}finally {
			System.out.println("This is finally keyword.");
		}

	}

}
