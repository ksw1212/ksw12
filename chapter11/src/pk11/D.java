package pk11;

public class D extends A{

	public D() {
		super();
		this.field="value";
		this.method();
		
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.method();
	}
}
