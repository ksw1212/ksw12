package pk8;

import java.util.Scanner;

public class StartMain {
	static boolean run=true;

	public static void main(String[] args) {
		Start a= new Start();
		String check;
		Scanner scan = new Scanner(System.in);
		
		int num; 
		while(run) {
			System.out.println("숫자입력 : ");
			num= scan.nextInt();
			check = a.check(num);
			//if(check.equals("Success"))
				//break;
		}
	}

}
