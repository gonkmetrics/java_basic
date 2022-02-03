package string2;

public class String06P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//substring() deletes the characters below a certain index
		String str = "wawa dada meme papa";
		String result = str.substring(6);
		System.out.println(result);
		
		//cuts everything outside of the range
		result = str.substring(7, 12);
		System.out.println(result);
		

	}

}
