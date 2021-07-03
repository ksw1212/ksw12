package pk10;

import javax.swing.JOptionPane;

public class FinalTest {
	
	private static final int Max=3;
	public static void main(String[] args) {
		int num=10;
		for(int i=0;i<Max;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값 :"));
			if(num>Max) 
				System.out.println("입력 값이 3보다 큽니다.");
			else
				System.out.println("입력 값이 3보다 크기않습니다.");
		}
		
	}

}
