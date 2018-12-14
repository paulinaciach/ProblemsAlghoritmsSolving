package info.ciach;

public class SecondMinutes {
	
	private static final String INVALID_MESSAGE = "Invalid value";

	public static void main(String[] args) {

//		getDurationString(933, 50);
//		getDurationString(61, 0);
//		
//		
//		getDurationString(3600);
//		getDurationString(3733);
//		getDurationString(0);
//		getDurationString(-1);
//		getDurationString(65, 9);
		
		
		getDurationString(1363);
		

	}

	public static String getDurationString(int minutes, int seconds) {

		String dataString = null;

		if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

			int h = minutes / 60;
			int m = minutes % 60;

			
			
			String hS = h+"h";
			if (h < 10) {
				hS="0"+h+"h";
			}
			String mS = m+"m";
			if (m < 10) {
				
				mS="0"+m+"m";
			}
			
			String sS = seconds+"s";
			if (seconds < 10) {
				
				sS="0"+seconds+"s";
			} 
			dataString = hS+" "+mS+" "+sS;
				
				
			System.out.println(dataString);
			return dataString;
		} else
			return INVALID_MESSAGE;

	}
	
	
	
	public static String getDurationString(int seconds) {

	
		
		if(seconds<0) {
			System.out.println(INVALID_MESSAGE);
			return INVALID_MESSAGE;
		}
		
		int minutes = seconds/60;
		seconds = seconds%60;
		
		return getDurationString(minutes, seconds);

	}

}
