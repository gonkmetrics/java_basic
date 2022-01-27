package exception2;

import java.util.Scanner;

public class ifElse01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input a");
		int a = scan.nextInt();
		System.out.println("input b");
		int b = scan.nextInt();
		if(b == 0) {
			System.out.println("0으로 숫자를 나눌 수 없습니다");
		}else {
			System.out.println(a/b);
		}
		
		

	}

}
