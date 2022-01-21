package structure;

public class Structure03P190 {

	public static void getCatInfo(Cat c) {
		// TODO Auto-generated method stub
		System.out.println("이름: " + c.name + "나이: " + c.age + "생년월일: " + c.birthDate);
		
	}
	
	public static void main(String[] args) {
		Cat cA = new Cat();
		cA.name="Cat";
		cA.age= 15;
		cA.birthDate= "050415";
		
		Cat cB = new Cat();
		cB.name="Cat2";
		cB.age= 16;
		cB.birthDate= "040409";
		
		getCatInfo(cB);

		}
	}
