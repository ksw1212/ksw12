package collection.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<UserInfo> userlist = new ArrayList<UserInfo>();
		UserInfo us = new UserInfo();
		String id;
		
		outer : while(true) {
			System.out.print("아이디 생성 : ");
			id = scan.next();
			us.setId(id);
			for(int i=0;i<userlist.size();i++) {
				if(us.getId().equals(userlist.get(i).getId())) {
					System.out.println("중복된 아이디입니다.");
					continue outer;
				}
			}
			System.out.println("패스워드 입력 : ");
			us.setPwd(scan.nextInt());
			userlist.add(us);
			for(int i=0;i<userlist.size();i++) {
				System.out.println(userlist.get(i).getId());
				System.out.println(userlist.get(i).getPwd());
			}
		}
	}

}
