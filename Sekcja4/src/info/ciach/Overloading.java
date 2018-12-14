package info.ciach;

public class Overloading {

	public static void main(String[] args) {
	
		
		area(6);

	}

	
	
	     public static double area(double radius){
	         
	         double areaOfCircle;
	         
	         if(radius<=0){
	             return -1.0;
	         }
	         
	         areaOfCircle = Math.PI*Math.pow(radius, 2);
	         
	         return areaOfCircle;
	     }
	     
	
	
	
}
