package pk9;

public class ConsTest {

	private int aa;
	private int bb;
	
	//생성자를 통해서 멤버변수 세팅
	public void ConsTest(int aa, int bb) {
		this.aa=aa;
		this.bb=bb;
		System.out.println(aa+", "+bb);
	}
	public static void main(String[] args) {
		
		ConsTest ct = new ConsTest();
		ct.ConsTest(1, 2);
		
	}

}
