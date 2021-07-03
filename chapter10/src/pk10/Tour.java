package pk10;

import java.util.Scanner;

public class Tour {
	
	public static void main(String[] args) {
		int people;
		Scanner scan = new Scanner(System.in);
		boolean run =true;
		
			System.out.println("관광객 수 : ");
			people = scan.nextInt();
			Guide gd= new Guide(people);
			System.out.println("관광객 등록");
			for(int i=0;i<gd.guest.length;i++) {
				
				System.out.print((i+1) + ".이름 : ");
				gd.guest[i].setName(scan.next());
				System.out.print((i+1) + ".성별 : ");
				gd.guest[i].setGender(scan.next());
				System.out.println((i+1) +"목적지 : " + Guide.point);
				System.out.println("---------------");
				
			}
			while(run) {
			
			System.out.println("1.관광객 정보");
			System.out.println("2.목적지 변경");
			System.out.println("3.종료");
			System.out.print("선택 >> ");
			int select = scan.nextInt();
			switch (select){
			case 1:
				for(int i=0;i<gd.guest.length;i++) {
				System.out.print((i+1)+". 이름 : " + gd.guest[i].getName()+"\n");
				System.out.print((i+1)+". 성별 : " + gd.guest[i].getGender()+"\n");
				System.out.println((i+1)+". 목적지 : " + Guide.point);}
				break;
			case 2:
				System.out.println("어디로 변경하시겠습니까?");
				Guide.point=scan.next();
				System.out.println(Guide.point+ "로 목적지 변경");
				break;
			case 3:
				System.out.println("종료");
				run = false;break;
			}
			
			
			
		}
	}

}
