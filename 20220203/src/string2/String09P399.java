package string2;

import java.util.Scanner;

public class String09P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("test");
		String b = new String("test");
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(a==b);
		String c = "test";
		String d = "test";
		//System.out.println(c==d);
		
		//.equals() compares the real values of strings instead of addresses
		//System.out.println(a.equals(b));
		
		String id = "admin";
		String pw = "123";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String idIn = scan.nextLine();
		if(idIn.equals(id)) {
			System.out.println("비밀번호를 입력하세요");
			String pwIn = scan.nextLine();
			if(pwIn.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 틀림");
			}
		} else {
			System.out.println("아이디 틀림");
		}
		
		

	}

}
