package pk16;

public class LocalInnerTest {
	int a = 100;//필드
	
	public void innerTest(int n) {
		int b=200;//지역변수
		final int c = n;
		
		class Inner{
			public void getData() {
				System.out.println("int a : "+ a);
				System.out.println("int b : "+ b);
				System.out.println("final int c : "+ c);
			}
		}
		Inner in = new Inner();
		in.getData();
		
	}
	
	
	
	public static void main(String[] args) {
		LocalInnerTest local = new LocalInnerTest();
		local.innerTest(0);

	}

}
