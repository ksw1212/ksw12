package pk16;

import java.util.Scanner;

public class EnumMain {
	//enum클래스
	public enum Item{
		start,pause,Exit
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("0:게임시작");
			System.out.println("1:일시정지");
			System.out.println("2:종료");
			System.out.print("번호를 입력하시오=>");
			Scanner scan = new Scanner(System.in);
			int n =scan.nextInt();
			Item start=Item.start;
			Item pause=Item.pause;
			Item exit=Item.Exit;
			
			if(n==start.ordinal()) {
				System.out.println("게임이 시작됩니다.");}
			else if(n==pause.ordinal()) {
				System.out.println("게임이 일시정지 됩니다.");}
			else if(n==exit.ordinal()) {
				System.out.println("종료합니다.");
				return;}
		}
	}

}
