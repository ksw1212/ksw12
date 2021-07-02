package collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest1 {

	public static void main(String[] args) {
		//String클래스에서 기본적으로 default 정렬이 되었음
		Set<String> set = new TreeSet<String>();
		
		set.add("강건마");
		set.add("우투리");
		set.add("황진");
		set.add("나훈아");
		System.out.println(set);

	}

}
