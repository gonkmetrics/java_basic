package exception2;

import java.util.Scanner;

public class TryCatch01P353 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try-catch statements are used for error testing
		//try statement allows a block of code to be tested for errors
		//catch statements gives control over which block is executed
		Scanner scan = new Scanner(System.in);
		System.out.println("A");
		int a = scan.nextInt();
		System.out.println("B");
		int b = scan.nextInt();
		
		try {
			System.out.println("initialized");
			System.out.println(a/b);
			System.out.println("finished");
		} catch(Exception e) {
			System.out.println("error: div/0");
		} finally {
			System.out.println("checked");
		}
		
		//the last statement in try-catch should be finally{}
		//which is code executed at the end of the test
		

	}

}
