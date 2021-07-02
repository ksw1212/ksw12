package collection.hashset;

import java.util.HashSet;
import java.util.Random;

public class LottoSet {

	public static void main(String[] args) {

		//Set은 중복된 값(엘리먼트)을 허용하지 않는다.
		//-hashSet : 정렬 안됨
		//-TreeSEt : 오름차순
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			//난수 발생 
			int v = (int)(Math.random()*45+1);
			//int v1 = new Random().nextInt();
			hs.add(v);
			if(hs.size()>=6) 
				break;
		}
		System.out.println("로또 1등담첨번호 : "+hs);
	}

}
