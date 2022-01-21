package overriding;

public class Dog extends Animal{
	public String color; //털색
	
	public void howl() {
		System.out.println("멍멍");
	}
	
	public void getInfo() {
		System.out.println(name+" "+age+" "+gender+" "+color);
	}
	
}
