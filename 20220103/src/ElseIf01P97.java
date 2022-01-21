import java.util.Scanner;

public class ElseIf01P97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//else-if is used for additional outcomes after than if statement
		Scanner scan = new Scanner(System.in);
		System.out.println("Input info");
		int num = scan.nextInt();
		
		if(num > 0) {//1st condition
			System.out.println("Positive number");
		} else if(num == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negative number");
		}
		scan.close();

	}

}
