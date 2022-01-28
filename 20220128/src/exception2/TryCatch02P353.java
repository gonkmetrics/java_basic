package exception2;

import java.util.Scanner;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input");
		String num = scan.nextLine();
		try {
			System.out.println("start");
			int conv = Integer.parseInt(num);
			System.out.println(conv);
			
			//or outofbounds
			//for(normal) (not String n:name enhanced)
			//{sysout(n)}
		} catch(Exception e) {
			System.out.println("정수 값이 아닙니다");
		} finally {
			System.out.println("checked");
		}

	}

}
