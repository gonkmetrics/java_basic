import java.util.Scanner;

public class ContinueQ1P123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int input = scan.nextInt();
		int sum = 0;
		int count;
		loop1: for(count=1; count <= input; count++){
			if(count % 2 == 0) {
				sum -= count;
				}
			sum += count;
			continue loop1;
			}
		System.out.println(sum);
		System.out.println("종료");
	}

}
