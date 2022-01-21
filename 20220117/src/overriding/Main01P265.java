package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1 = new Horse();
		
		//test
		h1.gender = "남";
		h1.age = 10;
		h1.name = "h1";
		h1.rank = 2;
		
		h1.howl();
		h1.getInfo();
		h1.getHorseInfo();
	}

}
