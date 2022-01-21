
public class Break01P120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break statements stop loops
		//when inside nested loops, break statements
		//stop all connected loops
		int a = 1;
		int[] arr = {9,8,7,6,1,2,3,4,5};
		for(int num:arr) {
			if(a == num) {
				System.out.println("stop at 1");
				break;
			}
			System.out.println(num);
		}

	}

}
