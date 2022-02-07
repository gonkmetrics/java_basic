package random1;

import java.util.Random;

public class Random03P484 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		//random number picker within integer limit
		int result = random.nextInt();
		System.out.println(result);
		
		//limit range: to 0-5
		int result2= random.nextInt(5);
		System.out.println(result2);

	}

}
