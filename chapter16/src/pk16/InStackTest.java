package pk16;

import java.util.Scanner;

public class InStackTest {

	public static void main(String[] args) {
		
		//최대 64개를 push 할 수 있도록 
		InStack stack = new InStack(64);
		Scanner scan = new Scanner(System.in);		
		while(true) {
			System.out.println("현재 데이터 수 : " + stack.size() + "/ 스택의 용량" + stack.capacity());
			
			System.out.println("(1)푸시 (2)팝 (3)픽 (4)덤프 (0)종료 : ");
			int select = scan.nextInt();
			if(select==0) 
				break;
			int x;
			switch(select) {
			 case 1: //푸시
				 System.out.print("데이터 : ");
				 x =scan.nextInt();
				 try {
					 stack.push(x);
				} catch (InStack.OverflowStackExcation e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				 break;
			 case 2: // 팝
				 try {
					x=stack.pop();
					System.out.println("팝한 데이터는 : "+ x + "입니다.");
				} catch (InStack.EmptyIntStackExcation e) {
					System.out.println("스택이 비어있습니다.");
				}
				 break;	 
			 case 3:
				 try {
					 x=stack.peek();
						System.out.println("픽데이터"+x);
				} catch (InStack.EmptyIntStackExcation e) {
					System.out.println("볼거없음");
				}
			 case 4:
					stack.clear();
					break;
			}
		}

	}

}
