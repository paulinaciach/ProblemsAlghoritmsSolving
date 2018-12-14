package paula.info.Sekcja5;

public class SumFandLast {

	public static void main(String[] args) {
		sumFirstAndLastDigit(23459);
	}

	
	public static int sumFirstAndLastDigit(int number) {
		
		int sum=0;
		int lastDigit;
		int firstDigit=0;
		
		if(number<0) {
			return -1;
		}else if(number<10&&number>0) {
			sum =number+number;
			System.out.println(sum);
			return sum;
		}
		
		lastDigit = number%10;
		
		while(number>0) {
			number=number/10;
			System.out.println("F: "+firstDigit);
			System.out.println("N: "+number);
			if(number!=0) {
			firstDigit=number;
			}
		}
		

		sum=firstDigit+lastDigit;
		System.out.println(sum);
		return sum;
			
		
		
		
	}
	
	
	
	
}
