package collection.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		int iArray[] = {50,40,30,20,10};
		String sArray[] = new String[5];
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		Arrays.fill(sArray, "HI!");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City = Arrays.asList("Seoul","inchon","busan","Daegu","Jeju");
		for(int i=0;i<City.size();i++)
			System.out.print(i +" : "+City.get(i) +" ");
	}

}
