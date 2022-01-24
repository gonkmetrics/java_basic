package polymorphism;

public class Unemployed extends Person{
	
	private boolean isTraining;

	public Unemployed(String name, int age, boolean isTraining) {
		super(name, age);
		this.isTraining = isTraining;
		// TODO Auto-generated constructor stub
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("Training: " + this.isTraining);
	}
	
	public void showUnemployed() {
		if(this.isTraining == true){
			System.out.println("실업자 입니다");
			System.out.println("직업교육을 받고있습니다");
		} else {
			System.out.println("실업자 입니다");
		}
		
	}

}
