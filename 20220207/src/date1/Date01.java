package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to get current time
		//import as java.util.Date
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		//SimpleDateFormat
		//import as java.text.SimpleDateFormat;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일  hh시 mm분 ss초");
		//gives date in format yyyy-mm-dd-hh-mm-ss (specified in field) and z for timezone
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일  hh시 mm분 ss초 z");
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);
		
		
		

	}

}
