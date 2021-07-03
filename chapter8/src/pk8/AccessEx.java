package pk8;



public class AccessEx {
	//접근한정자 실습
	//멤버변수
	private int aa; //은닉화(동일 클래스에서만 사용가능)
	public int bb; //공통(프로젝트가 달라도 사용가능)
	int cc;//  패키지가 같으면 사용가능
	
	public void SetA(int a) {
		aa=a;//private이여도 public메서드를 통해 외부에서 사용가능
	}
	public void SetB(int b) {
		bb=b;
	}
	public void SetC(int c) {
		cc=c;
	}
	public void Disp() {
		System.out.println("aa값 : " +aa+ "\nbb값 : "+bb+"\ncc값 : "+cc);
	}//class off
	
	public static void main(String[] args) {
		AccessEx obj = new AccessEx();
		//obj.aa =10; 멤버변수 직접 접근
		//obj.bb =20;
		//obj.cc =30;
		obj.SetA(10);//메서드로 변수방 초기화
		obj.SetB(20);
		obj.SetC(30);
		obj.Disp();
	}

}
