package casting;

public class Main02 {
	
	public static void main(String[] args) {
		Animal a = new Cat("cat3", 3);
		//instanceof keyword: checks if an object is an instance of a class
		//outputs boolean: true false answer
		System.out.println(a instanceof Cat); //true
		System.out.println(a instanceof Dog); //false
		System.out.println(a instanceof Animal); //true
		
		Animal b = new Dog("dog3", 5);
		System.out.println(b instanceof Dog); //true
		System.out.println(b instanceof Animal); //true
		System.out.println(b instanceof Cat); //false
	}
	
	//usage level modifier/사용 제한자
	//static: 

}
