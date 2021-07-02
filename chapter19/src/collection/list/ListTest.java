package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		//리스트에 데이터 추가
		ls.add("HI");
		ls.add("Hellow");
		ls.add("안녕");
		ls.add("Bye");
		ls.add("H");
		ls.add("I");
		for(int i=0; i<ls.size();i++) 
			System.out.println((i+1) +" : " + ls.get(i).toString());
		System.out.println();
		System.out.println("----데이터 추가후----");
		ls.add(3,"Everybody");
		for(int j = 0; j<ls.size();j++) 
			System.out.println((j+1) +" : " + ls.get(j).toString());
		System.out.println();
		ls.remove(0);
		System.out.println("----데이터 삭제후----");
		for(int j = 0; j<ls.size();j++) 
			System.out.println((j+1) +" : " + ls.get(j).toString());
		System.out.println();
		
	}

}
