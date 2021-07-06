package pk20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("GD7");
		str.add("neymar");
		str.add("MEGOD");
		
		//람다식
		//str의 요소들이 stream클래스로 입력이 된다.
		Stream<String> stream = str.stream();
		stream.forEach(s -> System.out.print(s+ " "));
		System.out.println();
		//확장 for문 
		System.out.println("----------확장for문-----------");
		for(String s : str ) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("----------정렬 후 출력---------");
		//ArrayList에 있는 요소들을 Stream으로 정렬하여 출력
		str.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println("----------method mapping---------");
		str.stream().map(s->s.length()).forEach(n->System.out.println(n));
		System.out.println("----------filter---------");
		str.stream().filter(s->s.length()>=5).forEach(n->System.out.println(n));
	}

}
