package selections;

public class Grades {
	public static void main(String[] args) {

		// Cuclcuating the grades
		// 90 - 100 A
		// 80 - 89 B
		// 70 - 79 C
		// 60 - 69 D
		// 0 - 59 F
		double grade = 77;

		if (grade >= 90) {
			System.out.println("A " + grade);
		} else if (grade >= 80) {
			System.out.println("B " + grade);
		} else if (grade >= 70) {
			System.out.println("C " + grade);
		} else if (grade >= 60) {
			System.out.println("D " + grade);

		} else {
			System.out.println("F " + grade);

		}

	}

}
