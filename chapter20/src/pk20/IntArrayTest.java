package pk20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		//생성
		IntStream stream = Arrays.stream(arr);
		///Stream 사용 sum()에 사용
		int sum = stream.sum();
		System.out.println(sum);
		
		///Stream 사용 count()에 사용
		//이미 사용했으므로 소멸된 Stream이다 Error 발생
		//int count = (int)stream.count();//Error
		//System.out.println(count);
	
		//stream객체 생성 후 연산 수행하는 코드
		IntStream stream2 = Arrays.stream(arr);
		int cnt = (int)stream2.count();
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		System.out.println(cnt);
		
		//stream 재생성
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
	}

}
