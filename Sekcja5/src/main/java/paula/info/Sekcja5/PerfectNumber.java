package paula.info.Sekcja5;

public class PerfectNumber {
	
	
	public static void main(String[] args) {
		
		isPerfect(28);
	}
	
	
	
	public static boolean isPerfect(int number) {
		
		int sum=0;
		
		if (number<1) {
			return false;
		}
		
		int divisor = 1;
		
		while(number>divisor) {
			if(number%divisor==0) {
				System.out.println(divisor);
				sum=sum+divisor;
			}
			divisor++;
		}
		
		
		if(sum==number) {
			System.out.println(true);
			return true;
		}else 
		System.out.println(false);
		return false;
	}
	

}
