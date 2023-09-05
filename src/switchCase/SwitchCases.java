package switchCase;

public class SwitchCases {

	public static void main(String[] args) {

		// There are some limits using Switch Cases
		// we can only use Switch Cases with
		// byte , int , char , String , short
		// and we can not use it with Relational Operators too < > ==

		String daysOfWeek = "Thur";

		switch (daysOfWeek) {
		case "Sat":
			System.out.println("Rest");
			break;
		case "Sun":
			System.out.println("Get ready for Monday");
			break;
		case "Mon":
			System.out.println("Get back to work");
			break;
		case "Tue":
			System.out.println("Work hard");
			break;
		case "Wed":
			System.out.println("two days to weekend");
			break;
		case "Thur":
			System.out.println("one day to weekend");
			break;
		case "Fri":
			System.out.println("Tomorrow is Weekend");
			break;
		default:
			System.out.println("Check your spelling !");

		}

	}

}
