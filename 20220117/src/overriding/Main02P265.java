package overriding;

public class Main02P265 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		
		//test
		d1.gender = "남";
		d1.age = 5;
		d1.name = "d1";
		d1.color = "검정";
		
		d1.howl();
		d1.getInfo();


	}

}
