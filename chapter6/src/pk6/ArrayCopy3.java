package pk6;
//얕은 복사
public class ArrayCopy3 {

	public static void main(String[] args) {

		Book bookArray1[] = new Book[3];
		Book bookArray2[] = new Book[3];
		
		bookArray1[0] = new Book("태백산맥"," 조경래");
		bookArray1[1] = new Book("데미안"," 헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가","유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		for(Book lang : bookArray2) {
			lang.showBookInfo();
		}
		bookArray1[0].setBookname("나 목");
		bookArray1[0].setAuthor("박완서");
		//원본의 영향을 받는다.
		System.out.println("=======복사본=======");
		for(Book lang : bookArray2) {
			lang.showBookInfo();
		}
		System.out.println("======원본=======");
		for(Book kang : bookArray1) {
			kang.showBookInfo();
		}
	}

}
