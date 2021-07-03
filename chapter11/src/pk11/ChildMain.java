package pk11;

public class ChildMain {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("--------------");
		Parent p = new Parent();
		p.method1();
		p.method2();
	}

}
