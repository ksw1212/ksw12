package pk6;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		int array1[] = {10,20,30,40,50};
		int array2[] = {1,2,3,4,5};
		
		//배열의 복사 : System.arraycopy(array1, 첨자(복사가 시작될 첨자), array2, 붙여넣기 시작, 붙여넣기 개수(끝첨자)); 
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+ " ");
		}
		for(int lang : array2) {
			System.out.print(lang+"\t");
		}

	}

}
