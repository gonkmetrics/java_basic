import java.util.Scanner;

public class Scanner01P91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The scanner function scans the console for an input from the user
		//After input, the code executes
		Scanner scan = new Scanner(System.in);
		
		//Stores input in variable a
		int a = scan.nextInt();
		
		//Prints the user inputted value in variable a
		System.out.println(a);
		
		//ends the scanner
		scan.close();

	}

}
