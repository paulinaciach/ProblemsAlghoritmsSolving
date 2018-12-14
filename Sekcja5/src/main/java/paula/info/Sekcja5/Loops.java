package paula.info.Sekcja5;

public class Loops {

	public static void main(String[] args) {
	
	boolean odp = isEvenNumber(5);
	System.out.println(odp);
	
	
	boolean odp2 = isEvenNumber(0);
	System.out.println(odp2);
	}

	public static boolean isEvenNumber(int number) {
		
		if(number%2==0) {
			return true;
		}else 
			return false;
		
		
	}
	
	
	
	
}
