package pk18_1;

public class GenEx_Main {

	public static void main(String[] args) {
		//String =>100
		GenEx<String> a = new GenEx<String>();
		a.setValue("100");
		String str =a.getValue();
		System.out.println(str);
		//Integer =>1000
		GenEx<Integer> b = new GenEx<Integer>();
		b.setValue(1000);
		Integer in =b.getValue();
		System.out.println(in);
		//char=>
		GenEx<Character> c = new GenEx<Character>();
		c.setValue('말');
		Character ch =c.getValue();
		System.out.println(ch);
		//Double=>3.14
		GenEx<Double> d = new GenEx<Double>();
		d.setValue(3.14);
		Double dou = d.getValue();
		System.out.println(dou);
	}

}
