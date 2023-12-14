package staticExamples;

public class MyCalculator {

	public static double subtraction(double a, double b) {
		double res = a - b;
		System.out.println("MyCalc - " + a + " Subtracted from " + b + " = " + res);
		return res;
	}

	public static double addition(double a, double b) {
		double res = a + b;
		System.out.println("Addition: " + a + " + " + b + " = " + res);
		return res;

	}

	public static double multiplication(double a, double b) {
		double res = a * b;
		System.out.println("multiplication: " + a + " * " + b + " = " + res);
		return res;
	}

	public static double division(double a, double b) {
		double res = a / b;
		System.out.println("Division: " + a + " / " + b + " = " + res);
		return res;
	}

	public static double module(double a, double b) {
		double res = a % b;
		System.out.println("Module: " + a + " % " + b + " = " + res);
		return res;
	}

	public static double percentage(double num, double perc) {
		double res = num / 100 * perc;
		System.out.println("Percentage: %" + perc + " of " + num + " = " + res);
		return res;
	}

	public static double power(double num, double pow) {
		double res = num;
		for (int i = 0; i < pow - 1; i++) {
			res = res * num;
		}
		System.out.println("Power: " + num + " to power of " + pow + " = " + res);
		return res;
	}

	public static void main(String[] args) {
		// we dont need to create an object of MyCalculator cuz it is Static
		// we can create an obeject for MyCalculator but it is not the right way if we
		// created a static method and we will have a yellow line under that.
		// If you have static variable then it is good to create a static method for
		// that too
		// ---------------------------------------------------------------------------
		// Example (Make sure uncomment it to see the changes)
		// MyCalculator obj = new MyCalculator();
		// obj.subtraction(12, 3); // ====> you will see a yellow under line here.
		// ---------------------------------------------------------------------------
		
		MyCalculator.subtraction(12, 3); // This is the right way to call the methode
											// when we created a static method in out class.

		MyCalculator.addition(10, 10);
		MyCalculator.division(20, 2);
		MyCalculator.module(3, 3);
		MyCalculator.percentage(100, 7);
		MyCalculator.multiplication(5, 5);
		MyCalculator.percentage(376, 10);
		MyCalculator.power(5, 2);
		
		

	}
}