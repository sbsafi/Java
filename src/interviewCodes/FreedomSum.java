package interviewCodes;

public class FreedomSum {

	public static void main(String[] args) {
		
		/* Write a snippet inside the below "freedomSum" method to find sum of three numbers
		 * with a condtion.
		 * QA . Given 3 integer values,a b c, return their sum. However, if one of the
		 * values is 10 then it doesn't count towards the sum and values to its right 
		 * do not count. So, for example, if b is 10, then both b and c do not count.
		 * 
		 * Example:
		 * freedomSum (1,2,3) ---> 6
		 * freedomSum (1,2,10) ---> 3
		 * freedomSum (1,10,3) ---> 1
		 */
		System.out.println("FreedomSum(5, 5, 5) " + " ===> " + freedomSum(5, 5, 5));
		System.out.println("FreedomSum(10, 5, 5) " + " ===> " + freedomSum(10, 5, 5));
		System.out.println("FreedomSum(5, 10, 5) " + " ===> " + freedomSum(5, 10, 5));
		System.out.println("FreedomSum(5, 5, 10) " + " ===> " + freedomSum(5, 5, 10));

	}

	public static int freedomSum(int a, int b, int c) {
		if (a == 10) {
			return 0;
		} else if (b == 10) {
			return a;
		} else if (c == 10) {
			return a + b;
		} else {
			return a + b + c;
		}
	}

}
