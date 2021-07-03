package pk11;

public class A {
	//같은 패키지에서는 protected라고 하더라도 public과 같다
	// 다른 패키지에서는 상속받은 자식클래스에는 public/ 일반클래스는 private
	protected String field;
	
	
	public A() {
	}
	
	protected void method() {
		System.out.println("A class");
		System.out.println("field");
	}
	
}
