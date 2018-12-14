package paula.info.Sekcja5;

public class DigitSum {
	
	public static void main(String[] args) {
		
		int a = sumDigits(25);
		//System.out.println(a);
	}
	
	
	public static int sumDigits(int number) {
		
		int sum=0;
		int remainder;
		
		if(number<10) {
			return -1;
			
		}else if(number>=10) {
			
			do{
				
				remainder = number%10;
				number = number/10;
				sum=sum+remainder;
				
				
			}while(remainder!=0);
			
		
			System.out.println(sum);
		
		}
	
			return sum;
		
		
		
	}
	
	
	

}
