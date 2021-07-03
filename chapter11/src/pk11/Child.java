package pk11;

public class Child extends Parent{

	
	public void method1() {
		super.method1();
	}
	//재정의됨
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
	
	
	
}
