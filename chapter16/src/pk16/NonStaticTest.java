package pk16;

import javax.swing.JOptionPane;

class Out2{
	//멤버 변수(인스턴스 변수(객체가 없으면 사용불가))
	int b=10;
	static int a=1;
	//생성자
	
	public class In{
		
		String Infun() {
			b=20;
			System.out.println(b);
			return (a+ "번쨰 Non-Static 내부 클래스");
		}
		
	}
}






public class NonStaticTest {

	public static void main(String[] args) {
		String str=" ";
		//외부 클래스 객체 생성
		Out2 obj1 = new Out2();
		
		//내부클래스 객체 생성
		Out2.In obj2 =obj1.new In();
		
		str=obj2.Infun();
		JOptionPane.showMessageDialog(null, str+"\n Success" );
	}

}
