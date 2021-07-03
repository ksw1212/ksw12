package pk15;

public class BoxingUnbxing {

	public static void main(String[] args) {
		//AutoBoxing 
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf("300");
		int number = 400;
		
		Integer total1 = obj1 + obj2;
		Integer total2 = obj1 + obj3;
		Integer total3 = number +obj3;
		System.out.println(total1);
		System.out.println(total2);
		System.out.println(total3);
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int tt1 =value1+value2;
		int tt2 =value1+value3;
		System.out.println(tt1);
		System.out.println(tt2);
	}

}
