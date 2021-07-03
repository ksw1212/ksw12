package pk15;

public class AutoBoxingTest {

	public static void main(String[] args) {
		
		//Auto-Boxing
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		//대입시 UnBoxing
		int value = obj;
		System.out.println(value);

		//연산
		int result = obj +100;
		System.out.println(result);
	}

}
