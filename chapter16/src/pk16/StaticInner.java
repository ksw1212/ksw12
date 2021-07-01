package pk16;

public class StaticInner {
	
	int a = 10;
	private int b = 100;
	static int c = 300;
	
	static class Inner{
		static int d=1000;
		
		public void getData() {
			//System.out.println("int a : " +a);멤버변수 a는 heap메모리를 사용해서 data영역의 static에서는 사용할 수 없다.
			//System.out.println("int b : " +b);//생존 주기가 다름
			System.out.println("int c : " +c);
		} 
	}

	public static void main(String[] args) {
		//방법1
		StaticInner.Inner i = new StaticInner.Inner();
		i.getData();
		/*방법2 :메인클래스를 이용했으므로 바로 사용가능
		 * Inner inner = new Inner(); inner.getData();
		 */
	}

}
