package pk17;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javastr = new String("java");
		//처음 생성된 메모리의 주소
		System.out.println("처음생성된 메모리의 주소 : "+System.identityHashCode(javastr));
		StringBuilder buffer=new StringBuilder(javastr);//StringBuilder 생성
		//Buffer메모리 주소
		System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android ");
		buffer.append("programming is fun!!!");
		
		//버퍼의 메모리 주소
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);
		javastr = buffer.toString();
		System.out.println(System.identityHashCode(javastr));
		System.out.println(javastr);
		
	}

}
