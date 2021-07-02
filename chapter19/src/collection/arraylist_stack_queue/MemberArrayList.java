package collection.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	//생성자
	private ArrayList<Member> arrayList;// 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();//메모리 확보
	}
	
	public void addmember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberid) {//멤버 아이디를 매개변수로 받는다.
		for(int i=0; i<arrayList.size();i++) {
			Member member=arrayList.get(i);
			int tempId = member.getMemberid();
			if(tempId==memberid) {
				arrayList.remove(i);
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
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

