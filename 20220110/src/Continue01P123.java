
public class Continue01P123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue statements
		//these statements are the opposite of break statements
		//they force the containing loop, or any specified loop to execute
		//continue statements can also be paired with labels
		
		for(int i=2; i<10; i+=2) {
			if(i==6 || i==8) {
				System.out.println("no output");
				continue;
			}
			System.out.println("number " + i);
		}

	}

}
