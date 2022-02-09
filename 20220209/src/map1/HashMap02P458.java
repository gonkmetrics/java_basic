package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> menu = new HashMap<>();
		menu.put("피자",9000);
		menu.put("파스타",6000);
		menu.put("햄버거",6000);
		menu.put("샐러드",4000);
		menu.put("스테이크",12000);
		System.out.println(menu);
		System.out.println(menu.get("피자"));
		System.out.println(menu.get("스테이크"));
		System.out.println(menu.get("햄버거"));

	}

}
