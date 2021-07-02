package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import collection.Member;

public class MemberHashSet {
	//생성자
	private HashSet<Member> hashset;// 선언
	
	public MemberHashSet() {
		hashset = new HashSet<Member>();//메모리 확보
	}
	
	public void addmember(Member member) {
		hashset.add(member);
	}
	public boolean removeMember(int memberid) {//멤버 아이디를 매개변수로 받는다.
		//for(int i=0; i<hashset.size();i++) {
			//Member member=hashset.get(i);
		Iterator<Member> ir =hashset.iterator();
		while(ir.hasNext()) {
			Member member =ir.next();
			int tempId = member.getMemberid();
			if(tempId==memberid) {
				hashset.remove(member);
				return true;
			}
			
			}
			/*
			 * Iterator<Member> it = arrayList.iterator(); while(it.hasNext()) { Member
			 * member=it.next(); int tempId = member.getMemberid(); if(tempId==memberid) {
			 * arrayList.remove(member); return true;
			 */
		
	
		//System.out.println(memberid + "존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : hashset) {
			System.out.println(member);
		}
		System.out.println();
	}
}

