package paula.info.Sekcja5;

public class Switch {

	
	public static void main(String[] args) {
			
		
		char switchChar = 'C';
		
		
		
		switch(switchChar) {
		
		case 'A':
			System.out.println("This value is A");
			break;
		case 'B':
			System.out.println("This value is B");
			break;
		case 'E': case 'D': case 'C':
			System.out.println("This value is "+switchChar);
			break;
		default:
			System.out.println("Value not found");
			break;
		
		
		
		
		
		}
		
		
		
		
	}
	
	
	
}
