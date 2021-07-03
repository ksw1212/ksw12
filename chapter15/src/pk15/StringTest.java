package pk15;

public class StringTest {

	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody!";
		String str2=" Have a nice day!";
		
		//System.out.println(System.identityHashCode(str1));
		//System.out.println(str1.length());
		//str=str1+str2;
		str1 = str1.concat(str2);
		System.out.println(str1);
		//System.out.println(System.identityHashCode(str1));
		//System.out.println(str1.length());
		System.out.println(str1.indexOf('d'));
		System.out.println(str2.indexOf('d'));
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
	}

}
