package string1;

public class String02P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//indexOf() searches the starting index of a specified string, which indexOf tries to match the closest of
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		//counts from 0
		System.out.println(get);
		
		int get1 = tomato.indexOf("toa");
		System.out.println(get1);
		//"toa" does not exist in the string, so it outputs -1S
		
		int get2 = tomato.indexOf("to", 1); //starts counting from position 1
		System.out.println(get2);
		//now it indicates the position/index of the second "to" in string "tomato"

	}

}
