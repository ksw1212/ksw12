package pk5;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		
		int dat1;
		//int dat2;
		
		dat1 = Integer.parseInt(JOptionPane.showInputDialog("값 입력 :"));
		//dat2 = Integer.parseInt(JOptionPane.showInputDialog("사원번호 입력 :"));
		//System.out.println(dat1);
		//10의배수 판별법
		if(dat1 % 10==0) {
			System.out.println(dat1 + "은 10배수다.");
		}else {
			System.out.println(dat1 + "는 10의 배수가 아니다.");
		}
		
	}

}
