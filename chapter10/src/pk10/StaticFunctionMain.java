package pk10;

import javax.swing.JOptionPane;

public class StaticFunctionMain {

	public static void main(String[] args) {
		/*일반적인 방법(객체선언=>heap)
		StaticFuncion SF = new StaticFuncion();
		System.out.println(SF.str2);*/
		
		//Static메서드는 클래스명.메서드로 접근이 적합하다.
		String str;
		str = StaticFuncion.getStatic();//클래스명으로 접근을 하면 스태틱을 사용해도 경고가 뜨지않음
		System.out.println(str);		

	}

}
