package pk6;

public class ArrayCopy02 {

	public static void main(String[] args) {
		//배열크기 3개짜리
	Book bookArray1[] = new Book[3];
	Book bookArray2[] = new Book[3];
	
	bookArray1[0] = new Book("태백산맥"," 조경래");
	bookArray1[1] = new Book("데미안"," 헤르만 헤세");
	bookArray1[2] = new Book("어떻게 살 것인가","유시민");
	System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
	for(Book lang : bookArray2) {
		lang.showBookInfo();
	}
	
	bookArray1[0] = new Book("태백산맥"," 조경래");

	}

}
