package pk3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		//int a = 65;//대문자 A
		int a =98;//소문자a
		System.out.println(a);
		System.out.println((char)a);//형변환(ASCII코드)
		
		System.out.println("========================");
		
		int b = -66;
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println("========================");
		
		char a2=66;//ASCII코드
		//char b2=-66; Error
		
		System.out.println(a2);
		System.out.println((int)a2);
		
		

	}

}
