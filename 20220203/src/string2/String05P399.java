package string2;

import java.util.Scanner;

public class String05P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using both .length() and charAt():
		
		int strCount = 0;
		Scanner scanString = new Scanner(System.in);
		System.out.println("input");
		String stringA = scanString.nextLine();
		int strLength = stringA.length();
		while(strCount < strLength) {
			System.out.println(stringA.charAt(strCount));
			strCount++;
		}

	}

}
