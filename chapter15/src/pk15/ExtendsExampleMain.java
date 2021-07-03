package pk15;

public class ExtendsExampleMain {

	public static void main(String[] args) {
		//String
		ExtendsExample v1 = new ExtendsExample();
		//Integer
		ExtendsExample v2 = new ExtendsExample();
		v1.setValue("태백산맥");
		v2.setValue(10);//AutoBoxing(자동형변환=>객체)
		
		System.out.println(v1.getValue());
		System.out.println(v2.getValue());
		//ver5이하 언박싱
		int i = (Integer)v2.getValue();//Integer => int
		//ver 5이상 언박싱
		int j= (int)v2.getValue();//Object 
		System.out.println(i+10);
		System.out.println(j+15);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
		
		String v3 =new String();
		Integer v4 =new Integer(20);
		System.out.println(v3.valueOf("대지"));
		System.out.println(v4.intValue());
		
		
	}

}
