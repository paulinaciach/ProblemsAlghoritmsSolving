package paula.info.Sekcja5;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getGreatestCommonDivisor(150,15);
	}

	
	public static int getGreatestCommonDivisor(int first, int second) {
		
		if(first<10 || second<10) {
			return -1;
		}
		int divisor=0;
		int lower=0;
		
		if(first>second) {
		 divisor=first;
		 lower =second;
		
		}else 
		{
			divisor=second;
			lower = first;
		}
		
	int greatesDiv=0;
	for(int i=lower; i>0; i-- ) {
		
		if(divisor%i==0 && lower%i==0) {
			
			greatesDiv = i;
			break;
		}
	
		
		}

		
		System.out.println(greatesDiv);
		return greatesDiv;
		
	}
	
	
}
