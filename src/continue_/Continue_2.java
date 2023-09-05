package continue_;

public class Continue_2 {

	public static void main(String[] args) {
		int x = 10;
		while (x > 0) {
			x--;
			if (x == 5) {
				continue;
			}
			System.out.println(x);
		}
		
	}

}
