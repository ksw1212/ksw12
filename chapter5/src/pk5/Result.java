package pk5;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String ID = scan.nextLine();
		System.out.println("비밀번호 : ");
		String Passward = scan.nextLine();
		System.out.println(ID);
		System.out.println(Passward);
		/*
		  비번 형변환(String -> int) */
		 int PW = Integer.parseInt(Passward);

		if(ID.equals("Smile")) {
			if(PW == 12345) {
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인 실패 : 비밀번호가 다릅니다.");
			}
		}else {
			System.out.println("로그인 실패 : 존재하지 않는 아이디 입니다."); 
		}
	}
}
