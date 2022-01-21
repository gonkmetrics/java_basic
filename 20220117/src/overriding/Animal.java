package overriding;

public class Animal {

		public String gender;
		public String name;
		public int age;
		
		public void howl() {
			System.out.println("동물이 웁니다");
		}
		
		public void getInfo() {
			//if (getClass() == PrintStream)
			System.out.println(gender+name+age);
		}
}
