package pk6;

//깊은 복사
public class ArrayCopy04 {

	public static void main(String[] args) {
		
		Book bookArray1[] = new Book[3];
		Book bookArray2[] = new Book[3];
		
		bookArray1[0] = new Book("태백산맥"," 조경래");
		bookArray1[1] = new Book("데미안"," 헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가","유시민");
		
		bookArray2[0] = new Book();//객체를 직접 생성
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			
		}
		for(int i =0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		

	}

}
