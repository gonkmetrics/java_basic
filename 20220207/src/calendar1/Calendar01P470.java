package calendar1;

import java.util.Calendar;

public class Calendar01P470 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar
		//not constructed with new keyword, so
		//get with Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		
		//now.get(Calendar.info); format
		System.out.println("year: "+now.get(Calendar.SECOND)+" month: "+now.get(Calendar.MONTH));
		
		//arguments also include DAY_OF_MONTH, DAY_OF_WEEK, AM_PM, HOUR, MINUTE, SECOND
		
		

	}

}
