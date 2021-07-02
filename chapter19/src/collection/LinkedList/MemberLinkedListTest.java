package collection.LinkedList;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberLinkedList =new MemberLinkedList();
		Member member1 =new Member(1001, "홍길동");
		Member member2 =new Member(1002, "임꺽정");
		Member member3 =new Member(1003, "유산슬");
		Member member4 =new Member(1004, "김덕배");
		Member member5 =new Member(1005, "GD7");
		
		memberLinkedList.addmember(member1);
		memberLinkedList.addmember(member2);
		memberLinkedList.addmember(member3);
		memberLinkedList.addmember(member4);
		memberLinkedList.addmember(member5);
		memberLinkedList.showAllMember();
		Member member6 =new Member(1003, "박진우");
		memberLinkedList.addmember(member6);
		//memberLinkedList.removeMember(member1.getMemberid());
		//memberLinkedList.showAllMember();
		memberLinkedList.showAllMember();

	}

}
