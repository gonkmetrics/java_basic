package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("n횟수:");
		final int count = scan.nextInt();
		int counter = 0;
		int heads = 0;
		int tails = 0;
		boolean result;
		
		while(counter <= count) {
			result = random.nextBoolean();
			counter++;
			if(result==true) {
				heads++;
			}else if(result==false) {
				tails++;
			}
		}
		System.out.println("앞: "+heads+'\n'+"뒤: "+tails);

	}

}
