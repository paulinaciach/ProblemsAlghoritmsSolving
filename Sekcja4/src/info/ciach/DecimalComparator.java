package info.ciach;

import java.text.DecimalFormat;

public class DecimalComparator {


		 public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
		     
		   
			
		      String output = Double.toString(firstNumber);
		      String output2 = Double.toString(secondNumber);
		     
		      
		     int dec = output.indexOf('.', 0);
		      
		   output =  (String) output.subSequence(dec, dec+4);
		    output2 = (String) output2.subSequence(dec, dec+4); 
		     
		      System.out.println(output +" "+output2);
		      
		      
		     if(output.equals(output2)){
		    	 
		         return true;
		     }else  
		    	 
		        return false;
		     
		   
		     
		     
		 }
		 
		 
		}
	
	

