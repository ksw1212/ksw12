package collection.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<>();
		
		while(true) {
			System.out.println("1.정보추가");
			System.out.println("2.정보삭제");
			System.out.println("3.전체정보");
			System.out.println("4.종료");
			System.out.print("항목선택 : ");
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			switch(select) {
			case 1://정보추가
				p =new Person();
				System.out.println("정보추가");
				System.out.print("이름");
				p.setName(scan.next());
				System.out.print("나이");
				p.setAge(scan.nextInt());
				System.out.print("전화");
				p.setTel(scan.next());
				personArr.add(p);
				System.out.println("정보가 저장 되었습니다.");
				break;
			case 2://정보삭제
				System.out.println("정보삭제");
				System.out.println("삭제할 이름 : ");
				String name = scan.next();
				for(int i=0;i<personArr.size();i++) {
					if(personArr.get(i).getName().equals(name)) {
						personArr.remove(i);
						System.out.println(name + "삭제되었습니다.");
					}else {
						if(i+1==personArr.size())
							System.out.println("없는 이름입니다.");
					}
				}
				break;
			case 3:
					System.out.println("등록인원 : " + personArr.size());
				for(int i=0; i<personArr.size();i++) {
					System.out.println(personArr.get(i).getName());
					System.out.println(personArr.get(i).getAge());
					System.out.println(personArr.get(i).getTel());
					System.out.println("---------------------------");
				}
				
				/*
				 * Iterator<Person> it = personArr.iterator(); 
				 * while(it.hasNext()) {//커서생성=iterator안에 data가 있음 p=it.next();//한줄 씩 읽기 시작
				 * System.out.println(p.getName()); 
				 * System.out.println(p.getAge());
				 * System.out.println(p.getTel()); }
				 */
				break;
			default :
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
	
}
