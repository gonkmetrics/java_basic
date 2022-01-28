package exception3;

public class Throws01P361 {
	
	public static void doIt(String[] s, int i) throws ArrayIndexOutOfBoundsException{
		System.out.println(s[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unchecked exception: fatal error, stops program
		//checked exception: errors in code at compile. can be recovered from if handled by throwing or try-catch blocks
		
		//when an exception occurs, the runtime will search the call stack, i.e. the try-catch blocks for a piece of code
		//that handles it i.e. catch{}
		
		//if an exception is not handled, it propagates to the main method and results in an unhandled exception i.e.
		//JVM does not know what to do with the exception
		
		//keywords throws and throw
		//these special methods can be executed with a try statement
		
		//the throws keyword indicates that an appended method will throw the specified exceptions only
		//the caller i.e. the try-catch stack handles the exception, instead of the program halting as the JVM handles it
		//this allows code to keep executing
		
		String[] greetings = {"hey", "hello", "hai", "yello"};
		int i = (int)(Math.random() * 5); //chooses any number from 0-4
		
		try {
			doIt(greetings, i);
		} catch (Exception e) {
			System.out.println("executed in main");
		}

	}

}
