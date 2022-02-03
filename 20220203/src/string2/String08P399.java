package string2;

public class String08P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trim() deletes blankspaces before the first character
		String str = "                           Hello                 Java            ";
		System.out.println(str.trim());
		System.out.println(str);
		
		System.out.println(str.replace(" ",""));
		
		str = str.trim();
		str = str.replace("  ", "");
		System.out.println(str);

	}

}
