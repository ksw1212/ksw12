package pk16;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1=3;
		b.method();
		A.C c = new A.C();
		c.field1=4;
		c.method();
		A.C.method2();
		a.method();
		A.C.field2=5;

	}

}
