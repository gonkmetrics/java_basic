package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s3 = new Student();
		s3.name = "Sae";
		s3.age = 18;
		s3.studentNum = 17;
		
		Salaryman e1 = new Salaryman();
		e1.name = "Yoo";
		e1.age = 25;
		e1.salary = 3000000;
		
		s3.getStuInfo();
		e1.getSalaryInfo();
	}

}
