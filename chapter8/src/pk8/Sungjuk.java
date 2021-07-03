package pk8;

import javax.swing.JOptionPane;

public class Sungjuk {

	//멤버변수=필드
	private String std_num;
	private String std_name;
	private int Java, Python, Bigdata;
	//생성자 생략free compile

	//메서드
	public void Sum() {
		System.out.println("합계 : "+ (Java+Python+Bigdata));
	}
	public void Avg() {
		System.out.println("평균 : "+ (Java+Python+Bigdata)/3);
	}
	
	
	public static void main(String[] args) {
		//rec
		
		   Sungjuk rec =new Sungjuk(); rec.std_num =
		  JOptionPane.showInputDialog("학번 : "); rec.std_name =
		  JOptionPane.showInputDialog("성명 : ");
		  
		  rec.Java =Integer.parseInt(JOptionPane.showInputDialog("Java : "));
		  rec.Python =Integer.parseInt(JOptionPane.showInputDialog("Python : "));
		  rec.Bigdata =Integer.parseInt(JOptionPane.showInputDialog("Bigdata : "));
		
		 System.out.println(rec.std_num+", "+rec.std_name + "의 성적입니다.");
		
		AccessEx rec2 =new AccessEx();
		
		  rec.Sum(); rec.Avg();
		
		rec2.SetA(100);//메서드는 퍼블릭이어서
		rec2.bb = 200;
		rec2.cc = 300;
		rec2.Disp();
		
		
	}

}
