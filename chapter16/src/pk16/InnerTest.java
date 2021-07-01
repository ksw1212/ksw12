package pk16;

class OutClass{
	//외부 클래스 멤버변수
	private int num = 0;
	private static int sNum = 20;
	private InClass inClass;//선언
	public OutClass(){
		inClass = new InClass();//내부 클래스의 객체생성
	}
	//내부 인스턴스 클래스
	class InClass{
		int inNum=100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(inNum);
		}	
	}
	//private의 멤버변수시 사용권장
	public void usingClass() {
		inClass.inTest();
	}
	//내부 정적(static)클래스
	static class InStaticClass{
		int inNum=100;
		static int sinNum=200;
		//num=500; //객체가 있어야 사용가능
		void inTest() {
			//num=500;
			inNum=100;
			sinNum=200;
			sNum=300;
			System.out.println(inNum);
			System.out.println(sNum);
			System.out.println(sinNum);
		}
		static void sTest() {
			sinNum=200;
			sNum=300;
			System.out.println("InStaticClass sinNum : " + sinNum + "내부 static변수");
			System.out.println("OutClass sinNum : " + sNum + "내부 static변수");
			//inNum=10; 생명주기 틀림
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		System.out.println("private으로 변수 접근시 호출");
		OutClass out = new OutClass();
		out.usingClass();
		System.out.println("외부클래스 먼저 생성후 내부클래스 호출");
		OutClass out2 = new OutClass();
		OutClass.InClass in2 = out.new InClass();
		in2.inTest();
		
		//외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass a = new OutClass.InStaticClass();
		a.sTest();
		a.inTest();
		//클래스명으로 바로 접근하기
		OutClass.InStaticClass.sTest();
	}
}
