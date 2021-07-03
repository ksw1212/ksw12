package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		//기본생성자로 객체를 만들되 객체의 이름은 R1(Move 2번, RAge)
		ThisTest R1 = new ThisTest();
		R1.Move();
		R1.Move();
		R1.RAge();
		System.out.println("===객체2===");
		//swing으로 입력을 받아서 로봇의 속도와 나이, 이름, 로봇번호를 출력
		String name = null;
		int speed;
		int age;
		String num = null;
		ThisTest R2 = new ThisTest();
		age =Integer.parseInt(JOptionPane.showInputDialog("나이 : "));
		R2.RAge(age);
		R2.RName(JOptionPane.showInputDialog("이름입력 : "+name));
		speed =Integer.parseInt(JOptionPane.showInputDialog("속도 : "));
		R2.Move(speed);
		R2.RNum(JOptionPane.showInputDialog("번호입력 : " +num));
		
	}

}
