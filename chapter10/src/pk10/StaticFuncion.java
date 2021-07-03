package pk10;

public class StaticFuncion {

	String str1="일반 멤버변수";
	static String str2="Static 멤버변수";
	
	public static String getStatic() {
		//ruturn str1; //ERROR : static 내부에서는 static 변수만 접근이 가능
		return str2;
		
	}
}
