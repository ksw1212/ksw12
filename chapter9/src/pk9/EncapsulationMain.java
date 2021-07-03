package pk9;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int area;
		String str="";
		Encapsulation cap = new Encapsulation();
		side = Integer.parseInt(JOptionPane.showInputDialog("side : "));
		height = Integer.parseInt(JOptionPane.showInputDialog("height : "));
		area=cap.Cal_Area(side, height);
		str="사각형의 넓이는 "+ area + "입니다.";
		System.out.println("사각형의 넓이는 "+ area + "입니다.");
		JOptionPane.showMessageDialog(null, "사각형의 넓이는 "+ area + "입니다.");
		
	}

}
