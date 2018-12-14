package paula.info.Sekcja5;

public class PalindromeDigit {

	public static void main(String[] args) {
		
		boolean check = isPalindorme(-323);
		System.out.println(check);
		
	}
	
	public static boolean isPalindorme(int number) {
		
		int reverse = 0;
		int lastDigit = 0;
		int dupNum = number;
		
		while(dupNum>0 || dupNum !=0 ) {
		
			lastDigit= dupNum%10;
			reverse = (reverse*10)+lastDigit;
			dupNum=dupNum/10;

		}
		System.out.println(reverse);
		System.out.println(number);
		if(reverse==number) {
		return true;
		}else 
			return false;
	
	

}
}