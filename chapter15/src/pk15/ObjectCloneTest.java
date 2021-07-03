package pk15;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle cir = new Circle(10, 20, 30);
		Circle copy =(Circle)cir.clone();	
		System.out.println(cir);
		System.out.println(copy);
		
		//hash값
		System.out.println(System.identityHashCode(cir));
		System.out.println(System.identityHashCode(copy));
		
	}

}
