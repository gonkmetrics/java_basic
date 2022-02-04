package math;

import java.util.Scanner;

public class Math05P480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int myValue = scan.nextInt();
		int comValue = (int) (Math.random()*6);
		if(myValue>comValue) {
			System.out.println("이겼습니다");
		}else if(myValue==comValue){
			System.out.println("동점");
		} else {
			System.out.println("졌습니다");
		}
		System.out.println("myValue: "+myValue);
		System.out.println("comValue: "+comValue);
		
		

	}

}
