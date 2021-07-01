package pk16;



public class MemberInner {

	//멤버변수
	int a= 10;
	private int b =100;
	static int c =200;
	
	//내부클래스
	class Inner{
		
		public  void printDate() {
			System.out.println("int a : "+ a);
			System.out.println("private int b : "+ b);
			System.out.println("static int c : "+ c);
			
		}
		
	}
	
	public static void main(String[] args) {
		//main크래스 객체생성
		MemberInner mi =  new MemberInner();
		//내부 클래스 객체 생성
		//메인클래스의 객체 outer를 ㄱ통해서 객체를 생성해야 한다.
		MemberInner.Inner i = mi.new Inner();
		//한줄 코딩
		//MemberInner.Inner i = new MemberInner().new Inner();
		i.printDate();
	}

}
