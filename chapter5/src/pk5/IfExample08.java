package pk5;

import java.util.Scanner;

public class IfExample08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		double num1 =Double.parseDouble(scan.nextLine()) ;//nextLine(): 기본타입이 String
		
		System.out.println(num1);
		
		System.out.print("두 번째 수 : ");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println(num2);
		//int num; 4byte 할당
		
		if(num2 != 0 ) {
			System.out.println("결과 : " + (num1/num2));
		}else {
			System.out.println("나눌수 없는 수입니다.");
		}
	}

}
