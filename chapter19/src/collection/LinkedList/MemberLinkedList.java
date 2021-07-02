package collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import collection.Member;

public class MemberLinkedList {
	//생성자
	private LinkedList<Member> linkedList;// 선언
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();//메모리 확보
	}
	
	public void addmember(Member member) {
		linkedList.add(member);
	}
	public boolean removeMember(int memberid) {//멤버 아이디를 매개변수로 받는다.
		for(int i=0; i<linkedList.size();i++) {
			Member member=linkedList.get(i);
			int tempId = member.getMemberid();
			if(tempId==memberid) {
				linkedList.remove(i);
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
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

