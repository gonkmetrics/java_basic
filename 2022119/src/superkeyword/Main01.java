package superkeyword;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane ap1 = new Airplane(300);
		ap1.fly();
		ap1.fly();
		for(int x = 0; x<9; x++) {
			ap1.breakSpeed();
		}					

	}

}
