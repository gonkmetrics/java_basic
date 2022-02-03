package string2;

public class String10P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = String.valueOf(1000);
		//converts to int, same as int = 1000
		System.out.println(a);
		System.out.println(a+1);
		String b = String.valueOf(5842.1992);
		//converts to primitive i.e. double, same as double b = 5842.1992
		System.out.println(b);
		System.out.println(b+1);
		
		//does the same as valueOf
		String c = 1000 + "";
		
		String d = String.valueOf(false);
		System.out.println(d);
		System.out.println(d+1);

	}

}
