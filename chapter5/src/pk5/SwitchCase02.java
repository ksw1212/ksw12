package pk5;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		//1: 예금조회 2:출금 3: 입금 4: 이체 그외 : 잘못....
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("해당 번호 입력 : "));
		
		switch (num) {
		
		case 1:
			System.out.println("예금조회를 선택했습니다.");break;
		case 2:
			System.out.println("출금을 선택했습니다.");break;
		case 3:
			System.out.println("입금을 선택했습니다.");break;
		case 4:
			System.out.println("이체를 선택했습니다.");break;
		default :
			System.out.println("잘못 선택하셨습니다.");
		}//switch종료
	}//main종료

}//class 종료
