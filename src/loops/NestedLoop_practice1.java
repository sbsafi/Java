package loops;

public class NestedLoop_practice1 {

	public static void main(String[] args) {
		// WorkOut Sets Example
		// you have to do 3 sets of 10, 8, 6

		int setCount = 10;
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= setCount; j++) {
				System.out.print(j + ", ");

			}
			setCount -= 2;
			System.out.println();
		} 
		

		
	}

}
