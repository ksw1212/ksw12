package pk20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayStreamTest {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("----------");
		
		IntStream st = Arrays.stream(arr);
		Arrays.stream(arr).forEach(s->System.out.print(s + " "));
		System.out.println();
		Arrays.stream(arr).forEach(n->System.out.print(n+ " "));
		System.out.println("------------------");
		int sum = (int)Arrays.stream(arr).sum();
		System.out.println(sum);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		/*
		 * collection에서 합을 구하는 법은 reduce와stream에서의 sum 두가지가 존재 
		 * 단, stream에서의 sum()은 IntStream, DoubleStream, LongStream와 같은 
		 * 기본형(primitive) 특화 스트림 보통의 방법은 mapToInt,mapToDouble,MapToLong의 메서드로 사용
		 */
		//intValue() : Integer -> int로 unBoxing
		int sum2 =list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println("----Collection mapToInt--------");
		System.out.println(sum2);
	}

}
