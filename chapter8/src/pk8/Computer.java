package pk8;

public class Computer {

	int sum1(int value[]) {
		int sum=0;
		for(int i=0;i<value.length;i++) {
			sum+=value[i];
			
		}
		return sum;
	}
	int sum2(int... values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
