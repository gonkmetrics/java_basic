package exception3;

public class Throw01P361 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//throw keyword
		
		//Math.random(); 0 starting from zero to defined number
		//i.e. finds a number in that range
		//to expand the range, do n+1
		//normally Math.random outputs doubles, but to limit that behaviour
		//stick an (int)
		
		//throw keyword throws any error of choosing without prerequisites
		//goes right to catch statement and matches with defined exception type
		//can be used with conditionals
		
		int randomNum = (int)(Math.random() * 10);
		System.out.println("outputted num: " + randomNum);
		
		try{
			//
			if(randomNum>3) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			System.out.println("within range/no error");	
		}
	} catch (Exception e) {
		System.out.println("created error");
		e.printStackTrace(); //outputs the jvm errors anyhow
	}
		
	}


}
