package paula.info.Sekcja5;

import java.util.Scanner;

/* Reading 10 numbers from the user console and print their sum
 * if input is not int continue to reading numbers up to 10*/

public class ScannerClass {

	
	public static void main(String[] args) {
		
		
		countToTen();
		
	}
	
	
	
	public static int countToTen(){
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int counter=1;
		
		
		
		
		do {
			System.out.println("Enter number: "+counter);
			boolean hasNext = sc.hasNextInt();
			
		
		if(hasNext) {
		   int number = sc.nextInt();
			sum+=number;
			counter++;
		}else if(!hasNext) {
			System.out.println("Invalid Value");
		}
		sc.nextLine();
		}while(counter<11);
		
		
		
		
		System.out.println("Sum of entred values: "+ sum);
		return sum;
	}
	
	
	
	
	
}
