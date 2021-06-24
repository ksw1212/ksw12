package pk5;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int month;
		int day;
		//1,3,5,7,8,10,12 =>31일까지 4,6,9,11=>30일까지 2월 28일
		System.out.println("월을 입력하세요 : ");
		month = scan.nextInt();
		
		switch (month) {
		
		case 1:  case 3: case 5: case 7: case 8: case 10: case 12:
			day=31; 
			break;
		case 4: case 6: case 9: case 11: //case: 중복사용 생략가능
			day=30;break;
		case 2:
			day=28; break;
		default:
			day=0;
			System.out.println(" 존재하지 않는 달입니다.");
		}
		System.out.println(month + "월은 "+ day + "일 까지 있습니다.");
		
		
	}

}
