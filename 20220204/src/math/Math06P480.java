package math;

import java.util.Scanner;

public class Math06P480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rock = 1;
		int paper = 2;
		int scissor = 0;
		int myValue = (int) (Math.random()*3);
		int comValue = (int) (Math.random()*3);
		if(myValue==comValue) {
			System.out.println("비겼습니다");
		} else if(myValue==scissor){
			if(comValue==rock) {
				System.out.println("졌습니다");
			}else {
				System.out.println("이겼습니다");
			}
		} else if(myValue==paper){
			if(comValue==scissor) {
				System.out.println("졌습니다");
			}else {
				System.out.println("이겼습니다");
			}
		} else if(myValue==rock){
			if(comValue==paper) {
				System.out.println("졌습니다");
			}else {
				System.out.println("이겼습니다");
			}
		}
		System.out.println("myValue: "+myValue);
		if(myValue==0) {
			System.out.println("가위");
		}
		else if(myValue==1) {
			System.out.println("바위");
		}
		else if(myValue==2) {
			System.out.println("보");
		}
		System.out.println("comValue: "+comValue);
		if(comValue==0) {
			System.out.println("가위");
		}
		else if(comValue==1) {
			System.out.println("바위");
		}
		else if(comValue==2) {
			System.out.println("보");
		}

	}
	//datatypes: byte, short, integer, long , float, double, boolean, character

}
