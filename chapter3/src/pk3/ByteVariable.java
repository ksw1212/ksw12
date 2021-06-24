package pk3;

public class ByteVariable {

	public static void main(String[] args) {
		
		byte bs1=-128; //8bit=1byte : -128 ~ 127(+0도 양수에 포함되기 때문에 양수128에서 1을 뺌)
		byte bs2=127;
		short s=32767;// short -32768 ~ 32767
		short s1=-32768;
		System.out.println(bs1);
		System.out.println(bs2);
		System.out.println(s);
		System.out.println(s1);
		

	}
	
}
