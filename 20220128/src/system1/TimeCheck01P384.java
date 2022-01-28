package system1;

public class TimeCheck01P384 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//currentTimeMillis(); gets current time in milliseconds from system clock
		long start = System.currentTimeMillis();
		System.out.println("starttime:"+start);
		
		long all = 0;
		
		for(long i = 0; i<200000000L; i++) {
			all += i;
		}
		System.out.println("1 to 2-whatever" + all);
		
		long end = System.currentTimeMillis();
		System.out.println("endtime: "+end);
		System.out.println("timepassed: "+(end-start));

	}

}
