package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String>  hashSet =new HashSet<String>();
		hashSet.add(new String("홍길동"));
		hashSet.add(new String("임꺽정"));
		hashSet.add(new String("우투리"));
		hashSet.add(new String("홍길동"));
		hashSet.add(new String("바리공주"));
		hashSet.add(new String("전우치"));
		hashSet.add(new String("박문주"));
		hashSet.add(new String("김덕배"));
		hashSet.add(new String("GD7"));
		System.out.println(hashSet);
		//boolean b1=hashSet.add("임꺽정");
		//System.out.println(b1);
		hashSet.add(new String("임꺽정"));
		//같은 엘리먼트(데이터)의 중복을 허용하지 않는
		boolean b1=hashSet.add(new String("임꺽정"));
		System.out.println(b1);
		System.out.println(hashSet);

	}

}
