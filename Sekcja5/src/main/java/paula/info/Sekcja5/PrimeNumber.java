package paula.info.Sekcja5;

import javax.sound.midi.Soundbank;

public class PrimeNumber {

	public static void main(String[] args) {

	//	largestPrime(45);
		
		
	LastlargestPrime(45);


		
	}
 static int largestPrime(int number) {
		int dzielnik = 0;
		int oryginal = number;

		do {
		for (int i = number; i > 0; i--) {
			if (number % i == 0) {
				dzielnik++;
			}
			
		}

		if (dzielnik == 2 && oryginal%number==0) {
			break;
		} else
			dzielnik=0;
			number--;
		
		}while(number!=0);
		
		
		System.out.println(number);
		return number;
}
	
	
	public static boolean isPrime(int number) {

		int dzielnik = 0;

		for (int i = number; i > 0; i--) {
			if (number % i == 0) {
				dzielnik++;

			}
		}

		if (dzielnik == 2) {
			System.out.println("yes");
			return true;
		} else
			System.out.println("false");
			return false;
	}
	


	public static int LastlargestPrime(int number) {
		
		int orgianl=number;
		boolean isPrime=true;
		int dzielnik=0;
	
do {
	 
	    if (number%2==0) 
    	isPrime=false;
		for (int i = number; i > 0; i--) {
			if (number % i == 0) {
				dzielnik++;
				}
		}	if (dzielnik == 2) {
			isPrime=true;
			
		}else isPrime=false;
  		
	    if(	isPrime==true && orgianl%number==0) {
	    	
	    	return number;
	    	
	    }else
	    	number--;
			dzielnik=0;
   }	while(number>2);
	
	System.out.println(number);
		return number;
		}	
}
	

	
	
	 
	
	
	
	
	
	
	
