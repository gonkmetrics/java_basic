import java.util.Scanner;

public class ScannerQ1P93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1193KRW=1USD
		System.out.println("Exchange rate is 1193 KRW = 1 USD");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter KRW Amount: ");
		
		double rate = 1193;
		double aKRW = scan.nextDouble();
		double aUSD = aKRW / rate;
		System.out.println(aUSD + " USD");
		scan.close();
		
		

	}

}
