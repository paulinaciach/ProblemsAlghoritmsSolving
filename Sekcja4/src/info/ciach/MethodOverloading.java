package info.ciach;

public class MethodOverloading {

	public static void main(String[] args) {

		// calcFeetAndInchesToCentimiters(2, 5);

		calcFeetAndInchesToCentimiters(7, 5);

		double test = calcFeetAndInchesToCentimiters(-7, 5);

		System.out.println((int) test);
		calcFeetAndInchesToCentimiters(5);

		double test2 = calcFeetAndInchesToCentimiters(13, 12);
		System.out.println(test2);
		
	}

	public static double calcFeetAndInchesToCentimiters(double feet, double inches) {

		double val1;
		double val2;

		if (feet >= 0 && inches >= 0 && inches <= 12) {

			val1 = feet * 12 * 2.54;
			val2 = val1 + (inches * 2.54);

			System.out.println(feet + " feet " + inches + " inches" + " = " + val2 + "cm");

			return val1 + val2;

		} else
			return -1;

	}

	public static double calcFeetAndInchesToCentimiters(int inches) {

		double val1;

		if (inches >= 0) {

			val1 = inches * 2.54;

			System.out.println(val1);
			return val1;

		} else
			return -1;

	}

}
