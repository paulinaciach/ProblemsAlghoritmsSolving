package info.ciach;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {

		
		printYearsAndDays(525600L);
		printYearsAndDays(3366000L);
		
		
		
		
	}


		   
		   
		   public static void printYearsAndDays(long minutes){
			    
			   long days;
			   long years;
			   long hours;
			   
			   if(minutes<0) {
				   System.out.println("Invalid Value");
				   
			   }else if(minutes>=0){
			   
			   hours = (minutes/60);
			   
			   days = (hours/24);
			   
			   years = days/365;
			   
			   if(years>0) {
			   days = days%365;
			   }
			   
			   
			   System.out.println(minutes+" min = "+years+" y and "+days+" d");
			   
			   }
			   
			   
			   
		   }
		   
		   
		   
		
	
}
