package break_;

public class Break_1 {

	public static void main(String[] args) {
		
		
		// Break ==> Stops the loop
		// we use this keyword in Switch case and Loop
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i>5) {
				break; // here the loops run till 6 and stops the iteration cuz 6 is bigger than 5
			}
		}

	}

}
