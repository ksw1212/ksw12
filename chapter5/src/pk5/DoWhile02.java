package pk5;

import javax.swing.JOptionPane;

public class DoWhile02 {

	public static void main(String[] args) {
		int num1,num2;
		//do ~ while 문은 무조건 한번 실행하고 반복이 시작됨ㅜ
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
			if(num1==num2) {
				System.out.println("Same");
				break;
			}
		System.out.println("different");	
		}while(num1 != num2);

	}

}
