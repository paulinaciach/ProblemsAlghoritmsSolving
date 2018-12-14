package info.ciach;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {

	int n =	getDaysInMonth(2, 2019);
	System.out.println(n);
	}

	public static boolean isLeapYear(int year) {

		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			return true;
		} else
			return false;

	}

	public static int getDaysInMonth(int month, int year) {
		
		boolean isLeap = isLeapYear(year);

		if (month < 1 && month > 12) {
			return -1;
		}
		else if (year < 1 && year > 9999) {
			return -1;
			
		} else if(isLeap == true) {
			return 29;
		} else
			
			switch (month) {

			case 1:case 3:case 5: case 7: case 8: case 10: case 12:
				return 31;

			case 2:
					return 28;

			default:
				return 30;		

	}

}
}