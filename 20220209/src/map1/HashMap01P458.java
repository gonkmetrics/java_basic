package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap01P458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map interface
		Map<String, String> map = new HashMap<>();
		
		map.put("chae","java");
		System.out.println(map);
		map.put("abc","xyz");
		System.out.println(map);
		
		System.out.println(map.get("abc"));
		
		map.remove(1);
		System.out.println(map);
		System.out.println(map.remove("abc"));
		
		map.size();

	}

}
