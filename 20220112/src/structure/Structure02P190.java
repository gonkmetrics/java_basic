package structure;

public class Structure02P190 {
	
	public static void getInfo(Person p) {
		// TODO Auto-generated method stub
		System.out.println(p.name + "'s info");
		System.out.println("name: " + p.name + "age: " + p.age + "phone: " + p.pNum + "id: " + p.pNum);
		
	}
	
	public static void main(String[] args) {
		//1
		Person pA = new Person();
		pA.name="Chae";
		pA.age=  23;
		pA.pNum= "01011112222";
		pA.uNum= 35;
		//2
		Person pB = new Person();
		pB.name="Park";
		pB.age=  24;
		pB.pNum= "01033334444";
		pB.uNum= 36;
		
		/* visual:
		+----------------------+--------------------+
		|         stack        |        heap        |
		+======================+====================+
		|         main         |       memory       |
		+----------------------+------+-------------+
		|          P2          | name | Chae - Park |
		|        (data in      +------+-------------+
		|       memory)        | age  | 23 - 24     |
		+----------------------+------+-------------+
		| from Structure01 --> | pNum | p(A, B).pNum|
		| values are being     +------+-------------+
		| substituted          | uNum | p(A, B).uNum|
		+----------------------+------+-------------+
		*/
		
		//info search
		getInfo(pA);
		getInfo(pB);
		
		
		
		
	}
	


}
