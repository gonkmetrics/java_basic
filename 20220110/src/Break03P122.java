
public class Break03P122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break labels
		//using break labels you can designate loops
		//and break/end them as a command
		out: for(int i=2; i<=9; i++) {
			System.out.println("output");
			for(int j=1; j<= 9; j++){
				if(j>4) {
					System.out.println("5 and above no output");
					break out;
					//thanks to this break label, this break
					//stops all the loops starting from "out"
					//and not just the inner j loop and its nested if loop
			}
				System.out.println(i * j);
		}
		System.out.println("----------------------");
		}
	}
}

