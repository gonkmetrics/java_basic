package abstract1;

public class Child extends Parent{
	//getAge overridden
	
	@Override
	public void getAge() {
		System.out.println("부모쪽 나이는 private이라 조회가 안됩니다");
	}

}
