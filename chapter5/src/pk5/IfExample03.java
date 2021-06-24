package pk5;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {
		int JumSu;
		char grade;
		JumSu = Integer.parseInt(JOptionPane.showInputDialog("점수 입력 : "));
		//System.out.println(JumSu);
		
		if(JumSu>=90) {
			grade='A';
		}else if(JumSu>=80){
			grade='B';
		}else if(JumSu>=70) {
			grade='C';
		}else if(JumSu>=60) {
			grade='D';
		}else { //위에 조건에 해당안되는 것들 모두
			grade='F';
		}
		System.out.println(grade);
	}//main

}//class
