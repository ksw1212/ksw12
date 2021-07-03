
package pk17;

public class StringTest2 {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);//toString
		System.out.println(javaStr.hashCode());//십진수
		System.out.println(System.identityHashCode(javaStr));//문자열주소값
		System.out.println(androidStr);
		javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
		
		int sum=0;
		sum+=1;
	}

}
