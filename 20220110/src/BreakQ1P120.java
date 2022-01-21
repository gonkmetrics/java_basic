import java.util.Scanner;

public class BreakQ1P120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int input = scan.nextInt();
		int sum = 0;
		int count = 0;
		loop1: for(count=0; count <= input; count++){
			sum += count;
			if(sum > input) {
				System.out.println("총합: " + sum);
				System.out.println("목표값: " + input);
				System.out.println("몇 까지 더했나?: " + count);
				System.out.println("1부터" + count + "까지 더하면" + input + "을 초과해" + sum + "가 됩니다.");
				break loop1;
				}
			}
		System.out.println("종료");
		}
}

