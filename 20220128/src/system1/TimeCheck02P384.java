package system1;

import java.util.Arrays;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try-catch
		//int[] array1 = new int[300000000];
		long start = System.currentTimeMillis();
		try {
			//for(int a = 0; a < 300000000; a++) {
			throw new ArrayIndexOutOfBoundsException();
		//	}
		} catch(Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("finished. time: "+(end-start));

	}

}
