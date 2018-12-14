package paula.info.Sekcja5;

public class AllFactors {
	
	
	public static void main(String[] args) {
		
		
		printFactors(30);
		
	}

	
	
	public static void printFactors(int number) {
		
		
		if (number<0) {
			System.out.println("Invalid value");
		}
		
		int divisor = 1;
		
		while(number>divisor) {
			
			if(number%divisor==0) {
				System.out.println(divisor);
			}
			
			divisor++;
			
		}
		
	}
	
}
