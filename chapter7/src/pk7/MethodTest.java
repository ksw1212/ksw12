package pk7;

import java.util.Scanner;


public class MethodTest {
	int cnt = 0;
	int input_num = 0;
	
	int[] bread = null;
	int count = 0;
	boolean run=true;
	
	
	void makeBread() {
		System.out.println("빵 완성!!");
	}
	
	void makeBread(int count) { //int count=3
		bread = new int[count]; // bread = new int[5]
		
		for(int i = 0; i < bread.length; i++) {
			System.out.println( (i+1) + "번 빵 완성!!!");
			
		}
		System.out.println("요청하신 " + count + "개의 빵이 모두 완성되었습니다");
	}
	
	void makeBread(int count, String name) {
		bread = new int[count];
		
		for(int i = 0; i < bread.length; i++) {
			System.out.println((i+1) + "번째 " + name + " 완성!!!");
		}
		System.out.println("요청하신 " + count + "개의 " + name + "이 모두 완성되었습니다");
	}
	
	void order() {
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("1. 빵 개수만 선택 | 2. 빵 개수와 종류 선택 | 3. 종료");
			System.out.print("선택 > ");
			input_num = sc.nextInt();
			
			if(input_num == 1) {
				System.out.print("주문할 빵 갯수 : ");
				cnt = sc.nextInt(); 
				makeBread(cnt); //매개변수는 갯수와 타입만 맞으면 됨.
			}
			else if(input_num == 2) {
				System.out.print("빵 갯수 : ");
				cnt = sc.nextInt();
				
				System.out.print("빵 이름 : ");
				String name = sc.next();
				makeBread(cnt, name);
				
			}
			else if(input_num == 3) {
				run=false;
				System.out.println("프로그램 종료");
				
			}
		}
	}
}