package paula.info.Sekcja5;

public class DayOfTheWeek {
	
	public static void main(String[] args) {
		
//		printDayOfTheWeek(1);
//		printDayOfTheWeek(2);
//		printDayOfTheWeek(3);
//		printDayOfTheWeek(4);
//		printDayOfTheWeek(5);
//		printDayOfTheWeek(6);
//		printDayOfTheWeek(7);
//		printDayOfTheWeek(-3);
//		
		
		
		printDayOfTheWeekIf(1);
		printDayOfTheWeekIf(2);
		printDayOfTheWeekIf(3);
		printDayOfTheWeekIf(4);
		printDayOfTheWeekIf(5);
		printDayOfTheWeekIf(6);
		printDayOfTheWeekIf(7);
		printDayOfTheWeekIf(-3);
		
		
		
	}
	
	
	
	private static void printDayOfTheWeek(int DayOfTheWeek){
		
	
		switch(DayOfTheWeek) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Value");
			break;
			
		}
	}
	
	
	
	private static void printDayOfTheWeekIf(int day){
	
		
	if(day==1) {
		System.out.println("Monday");
		}else if(day==2) {
		System.out.println("Tuesday");
		}else if(day==3) {
		System.out.println("Wednesday");}
		else if(day==4) {
		System.out.println("Thursday");}
		else if(day==5) {
		System.out.println("Friday");}
		else if(day==6) {
		System.out.println("Saturday");}
		else if(day==7) {
		System.out.println("Sunday");}
		else  
		System.out.println("Invalid Value");
		
		
	}
		
		
	}
	
	


