
package pk17;

public class StBufferTest {

	public static void main(String[] args) {
		
		String str="";
		StringBuffer buf = new StringBuffer("Nice Day!!!");
		//StringBuffer문자열 처리
		System.out.println(buf.toString());
		//StringBuffer 크기
		System.out.println(buf.length());
		//StringBuffer용량(기본16사이즈 + 문자열크기 추가)
		System.out.println(buf.capacity());
		//StringBuffer용량증가(현재의 용량보다 큰수로 매개변수사용시 2배+2)
		System.out.println(buf.capacity());
		buf.ensureCapacity(50);//권장크기는 2배+2 그 이상은 그대로 나옴(권장x)
		System.out.println(buf.capacity());
		//문자열에 새로운 문자열의 일부내용추가
		buf.insert(0, "Hi! ");
		buf.insert(13, " Everybody!");
		System.out.println(buf);
		//StringBuffer문자열의 일부내용제거
		buf.delete(0, 4);//0번째부터 4글자 지우기
		System.out.println(buf);
	}

}


