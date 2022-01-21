package thiskeyword;

public class Person {
	private String namePerson;
	private int agePerson;
	private int moneyPerson;
	private String majorPerson;
	
	public Person(String namePerson, int agePerson, int moneyPerson, String majorPerson) {
		//a this. prefix refers to the current class instance variable
		//i.e. instance variable vs local variable
		//this eliminates confusion between attributes and parameters with the same name
		//therefore while namePerson values are called with the same variable name
		//they are separated by keyword this. which separates them into pe1.namePerson and pe2.nP
		this.namePerson = namePerson;
		this.agePerson = agePerson;
		this.moneyPerson = moneyPerson;
		this.majorPerson = majorPerson;
		
	}
	
	public void getInfo() {
		//System.out.println("Name is " + namePerson + '\n' + "Age is " + agePerson + '\n' +
		//		"Money is " + moneyPerson + '\n' + "Major is " + majorPerson + '\n');
		System.out.println("Name is " + this.namePerson + '\n' + "Age is " + this.agePerson + '\n' +
						"Money is " + this.moneyPerson + '\n' + "Major is " + this.majorPerson + '\n');
		//adding the this keyword to the above is unnecessary, but makes sure the variable referenced
		//is peN.variable at runtime, instead of just directly grabbing the local variable
	}

}
