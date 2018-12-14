package paula.info.Sekcja5;

public class Sum3And5 {

	public static void main(String[] args) {
		
		
		int total =0;
		int counter =0 ;
		
		for(int i=1; i<=1000; i++) {
			
			if(i%3==0 && i%5==0) {
				
			System.out.println("Number divided by 3 and 5: "+i);
			
			total = total + i;
			counter++;
			
			if(counter==5) 
				break;
			
			}
			
			
		}
		
		System.out.println(total);
		
	}
	
	
	
}
