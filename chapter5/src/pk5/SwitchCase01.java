package pk5;

import javax.swing.JOptionPane;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		/*
		 * int ranking; char medalColor; ranking =
		 * Integer.parseInt(JOptionPane.showInputDialog("값을 넣으세요 : "));
		 * 
		 * switch(ranking) {
		 * 
		 * case 1:medalColor='G'; break;
		 * 
		 * case 2:medalColor='S'; break;
		 * 
		 * case 3:medalColor='B'; break;
		 * 
		 * default: medalColor='A'; } System.out.println(ranking + "등 메달은 : " +
		 * medalColor + "입니다.");
		 */
		int ranking;
		char medalColor;
		ranking = Integer.parseInt(JOptionPane.showInputDialog("값을 넣으세요 : "));
		
		switch(ranking) {
		
		case 1:medalColor='G'; break;
		
		case 2:medalColor='S'; break;
		
		case 3:medalColor='B'; break;
		
		default:
			medalColor='A'; //default 값을 초기값으로 대체할수 있다.
		}
		System.out.println(ranking + "등 메달은 : " + medalColor + "입니다.");
	}

}
