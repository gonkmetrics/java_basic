package inheritance;

public class Salaryman extends Person {
	
	public int salary;
	
	public void getSalaryInfo() {
		System.out.println("이름은"+name+"입니다"+"나이는"+age+"입니다"+"연봉은"+salary+"입니다");
	}
}

