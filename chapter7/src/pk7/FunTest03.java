package pk7;

import javax.swing.JOptionPane;

public class FunTest03 {
	
	//void는 return값을 가질수 없다
	public void sum(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}

	public static void main(String[] args) {
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//static에서 호출되지 않았으므로 컴파일 할수 없음
		//sum(num1,num2);//ERROR
		//객체를 만들어서 강제로 호출
		FunTest03 Obj=new FunTest03();
		Obj.sum(num1, num2);
		
	}

}
