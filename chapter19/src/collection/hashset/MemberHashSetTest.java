package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberArrayList =new MemberHashSet();
		Member member1 =new Member(1001, "홍길동");
		Member member2 =new Member(1002, "임꺽정");
		Member member3 =new Member(1003, "유산슬");
		Member member4 =new Member(1004, "김덕배");
		Member member5 =new Member(1005, "GD7");
		
		memberArrayList.addmember(member1);
		memberArrayList.addmember(member2);
		memberArrayList.addmember(member3);
		memberArrayList.addmember(member4);
		memberArrayList.addmember(member5);
		memberArrayList.showAllMember();
		memberArrayList.removeMember(member1.getMemberid());
		memberArrayList.showAllMember();
		Member member6 =new Member(1003, "유산슬");
		memberArrayList.addmember(member6);
		memberArrayList.showAllMember();

	}

}
