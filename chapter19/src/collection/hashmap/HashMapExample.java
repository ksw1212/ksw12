package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬랙션 생성
		Map<String, Integer> map =new HashMap<String, Integer>();
		//객체저장
		map.put("홍길동", 185);
		map.put("임꺽정", 200);
		map.put("우투리", 150);		
		map.put("홍길동", 172);
		//객체 찾기
		System.out.println("우투리 : " + map.get("우투리"));
		System.out.println(map.size());
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> ks = keySet.iterator();
		while(ks.hasNext()) {
			String key =ks.next();
			Integer value =map.get(key);
			System.out.println("\t" + key + " " + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println();
		
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> es = entrySet.iterator();
		while(ks.hasNext()) {
			Map.Entry<String, Integer> entry = es.next();
			String key = entry.getKey();
					
			Integer value =entry.getValue();
			System.out.println("\t" + key + " " + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println();
		//전체삭제
		map.clear();
		System.out.println(map.size());
	}

}
