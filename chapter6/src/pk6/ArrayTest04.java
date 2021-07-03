package pk6;

public class ArrayTest04 {

	public static void main(String[] args) {
		double data[]= new double[5];
		int size = 0;
		
		data[0] = 10.0;
		size++;
		data[1] = 20.0;
		size++;
		data[2] = 30.0;
		size++;
		
		//초기화되지 않는 나머지는 0.0으로 설정되어있음
		
		for(int i= 0; i<size;i++) {
			System.out.println(data[i]);

	}

	}
}
