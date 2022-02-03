package string2;

public class String04P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.length() allows you to count the length of a string (spaces included)
		String name = "baba yoyo keke lala pepe";
		System.out.println(name.length());
		
		//.replace() allows you to replace a string
		String report = "Hello my name is ABC";
		System.out.println(report.replace("ABC", "XYZ"));
		//to force the replacement
		report = report.replace("ABC", "XYZ");
		System.out.println(report);

	}

}
