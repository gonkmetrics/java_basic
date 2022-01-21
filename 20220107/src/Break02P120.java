
public class Break02P120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 9; i++) {
			System.out.println(i);
			for(int j = 1; j<=9; j++) {
				if(j>4) {
					System.out.println("5");
					break;
					//what is happening is that the loops
					//are stacking multipliers of i and j
					//but the break stops j from incrementing 
					//above 5, as if j<=4 in the conditions for
					//the j loop
					//key: 
					//this break only affects the j loop
				}
				System.out.println(i*j);
			}
			System.out.println("---------");
		}

	}

}
