import java.util.Scanner;

public class If02P93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Declare variables
		int su;
		
		System.out.println("Input number: ");
		su = scan.nextInt();
		
		if(su > 0) {
			System.out.println("This is a positive number");
		}
		
		scan.close();
	}

}
