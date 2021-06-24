package pk3;
//java version10이상
public class TypeInference {

	public static void main(String[] args) {
		
		int i = 10;
		var j = 10.0;//double j = 10.0
		var str = "hello";//String str = "hello"
		//var은 한번선언하면 형변환이 불가함
		i=100;
		str = "test";
		j=10.5;
		/*
		 * str = 3;위에서 str변수가 string으로 인식되었기 때문에 
		 * 아래에서 정수를 넣을경우 오류가 생긴다.
		 */
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

	}

}
