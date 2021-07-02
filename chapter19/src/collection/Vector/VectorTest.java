package collection.Vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		
		//크기를 1로 선언
		Vector<Object> vec = new Vector<Object>(1);
		obj= 20210702;
		vec.add(obj);//엘리먼트 추가
		//vector의 용량과 수
		System.out.println("용량 1" + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 1" + vec.size());
		System.out.println();
		
		obj= "some people";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량 2" + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 2" + vec.size());
		System.out.println();
		
				
		obj= "dream of success";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량 3" + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 3" + vec.size());
		System.out.println();
		
		
		obj= "While";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량" + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 " + vec.size());
		System.out.println();
		
		obj= "other people";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량 4" + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 4" + vec.size());
		System.out.println();
		obj= "get up";
		vec.addElement(obj);
		//vector의 용량과 수
		System.out.println("용량 5" + vec.capacity());
		//엘리먼트 수
		System.out.println("크기는 5" + vec.size());
		System.out.println();
		
		System.out.println(vec);
	}
	

}
