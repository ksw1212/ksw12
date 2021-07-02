package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//Comparator : 정렬을 재정의 할 때
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2))*-1;
	}
	
}

public class ComparatorTest2 {

	public static void main(String[] args) {
		//String클래스에서 기본적으로 default 정렬이 되었음
				Set<String> set = new TreeSet<String>(new MyCompare());
				
				set.add("강건마");
				set.add("우투리");
				set.add("황진");
				set.add("나훈아");
				System.out.println(set);

	}

}
