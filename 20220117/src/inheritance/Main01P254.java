package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Chae";
		s1.age = 20;
		s1.studentNum = 15;
		
		s1.getInfo();
		s1.getStuInfo();
		
		Student s2 = new Student();
		s2.name = "Kim";
		s2.age = 19;
		s2.studentNum = 16;
	}
/*
+------------+--------------------------------------+
| 스택       | 힙                                   |
+------------+--------------------------------------+
| main       | 메모리 주소(n)                       |
+------------+--------------------------+-----------+
| Student s2 | String name              | Kim       |
|            +--------------------------+-----------+
|            | int age                  | 19        |
|            +--------------------------+-----------+
|            | child[studentNum]        | 16        |
|            +--------------------------+-----------+
|            | +methods: getInfo; child[getStuInfo] |
+------------+--------------------------------------+
 * 
 */
}
