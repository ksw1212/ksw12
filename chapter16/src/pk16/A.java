package pk16;



public class A{

	public A() {
		System.out.println("A 객체가 생성됨");
	}
	//인스턴스 클래스
	public class B{
	int field1;
	//static int field2;
	
	//생성자
	public B() {
		System.out.println("B객체가 생성됨");}
	//메서드
	public void method() {}
	//static vodi method2() {}
	
	}
	static class C{
		int field1;
		static int field2;
		public C(){System.out.println("c객체가 생성됨");}
		public void method() {}
		static void method2() {}
	}
	void method() {
		//로컬 클래스
		class D{
			public D() {
				System.out.println("D객체가 생성됨");}
				int field1;
				public void method1() {}
			}
		D d = new D();
		d.field1=3;
		d.method1();
	}
}


