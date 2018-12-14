package paula.info.Sekcja5;

import javax.print.attribute.standard.RequestingUserName;

public class HasSameLastDigitAtLeastForTwo {

	public static void main(String[] args) {

		hasSameLastDigit(16, 16, 1);
	}

	public static boolean hasSameLastDigit(int a, int b, int c) {
		
		if(a>100 || b>100 || c>100 || a<10 || b<10 || c<10) {
			System.out.println("Invalid Value");
			return false;
		}
		
			int lastA = a%10;
			int lastB = b%10;
			int lastC = c%10;
		
			
			if(lastA==lastB || lastB==lastC || lastC==lastA) {
				System.out.println(true);
				return true;
			}else 
				System.out.println(false);
				return false;
			
			
			
			
		}
			
			
	

}
