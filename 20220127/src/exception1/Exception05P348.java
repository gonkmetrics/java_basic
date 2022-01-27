package exception1;

public class Exception05P348 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //error case 5
		//wrong format. i.e. putting characters in int, etc
		String a = "1000abc";
		int result = Integer.parseInt(a);
		System.out.println(result);

	}

}
