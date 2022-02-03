package stringbuilder1;

import java.util.concurrent.TimeUnit;

public class Builder05P408 {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		int ct = 0;
		
		try {
			 do {
					a.deleteCharAt(ct);
					System.out.println(a);
					ct+=(2);
					System.out.println(ct);
				} while(true) ;
			}
			catch (StringIndexOutOfBoundsException sp) {}
			}
	}
		
		

	


