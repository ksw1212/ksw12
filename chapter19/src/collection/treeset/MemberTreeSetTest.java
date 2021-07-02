package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet =new MemberTreeSet();
		Member member1 =new Member(1001, "홍길동");
		Member member2 =new Member(1002, "임꺽정");
		Member member3 =new Member(1003, "유산슬");
		Member member4 =new Member(1004, "김덕배");
		Member member5 =new Member(1005, "GD7");
		
		memberTreeSet.addmember(member1);
		memberTreeSet.addmember(member2);
		memberTreeSet.addmember(member3);
		memberTreeSet.addmember(member4);
		memberTreeSet.addmember(member5);
		memberTreeSet.showAllMember();
		memberTreeSet.removeMember(member1.getMemberid());
		memberTreeSet.showAllMember();
		Member member6 =new Member(1003, "유산슬");
		memberTreeSet.addmember(member6);
		memberTreeSet.showAllMember();

	}

}
