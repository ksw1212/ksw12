package pk16;

import javax.swing.JOptionPane;

class Out {
	
	static int a=1;//객체 생성과 상관없이 사용가능(독립적)
	int b;//객체를 통해서 사용
	//객체생성과 상관없이 사용가능
	public static class In{
		String Infun() {
			return(a+ "번째");
		}
	}
}


public class EmbedTest {

	public static void main(String[] args) {
		//생략 static은 객체없이 클래스명으로 접근
		Out.In i = new Out.In();
		System.out.println(i.Infun());
		JOptionPane.showMessageDialog(null, i.Infun());
	}

}
