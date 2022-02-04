package stringbuilder2;

public class Builder06P408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setCharAt() lets you change one character to another at a certain index
		StringBuilder str = new StringBuilder("abcdefg");
		System.out.println(str);
		
		//setCharAt(index,char) is the format
		//changing index 5 to z
		str.setCharAt(5,'z');

	}

}
