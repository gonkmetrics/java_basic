package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using scanner get whole string
		//using scanner get a specific word or string to query for
		//find the number of iterations of the word and the index of the specific words in the whole string
		//output
		
		int countIndex = 0;
		int prevIndex = 0;
		Scanner scanWhole = new Scanner(System.in);
		Scanner scanPart = new Scanner(System.in);
		System.out.println("whole");
		String whole = scanWhole.nextLine();
		System.out.println("part");
		String part = scanPart.nextLine();
		
		for(int countWord = 0;; countWord++) {
			if(countIndex == -1) {
				System.exit(1);
			}
			countIndex = whole.indexOf(part, prevIndex);
			System.out.println("At index" + countIndex + "is the " + countWord);
			if(prevIndex == 0) {
				prevIndex++;
			} else {
				prevIndex += countIndex;
			}

		}
		

	}

}
