package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("홍길동");
		treeset.add("강건마");
		treeset.add("임꺽정");
		treeset.add("우투리");
		
		for(String lang : treeset) {
			System.out.println(lang);
		}

	}

}
