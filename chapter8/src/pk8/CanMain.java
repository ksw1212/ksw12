package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		//변수선언
		int a=0;
		String b="";
		Scanner scan = new Scanner(System.in);
		
		
		//객체선언
		Vending vend = new Vending();
		vend.init();
		
		//showcan
		System.out.println("돈을 투입하시오 : ");
		a = scan.nextInt();
		vend.showCans(a);
		//outcan
		System.out.println("음료를 선택하시오 :");
		b = scan.next();
		vend.outCan(b);
		
	}

}
