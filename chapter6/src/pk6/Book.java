package pk6;

public class Book {
	
	public String Bookname;//멤버변수
	public String Author;
	
	
	//메서드나 생성자는 같은 이름이 중복될수 없다.
	//그러나 매개변수의 갯수나 타입이 다르면 올수있다.
	//다형성 
	
	//생성자의 다형성  = 오버라이딩
	public Book() {};//생성자 : 클래스를 초기화
	
	public Book(String Bookname, String Author) {
		
		this.Bookname=Bookname;
		this.Author=Author;
		
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
	public void showBookInfo() {
		System.out.println(Bookname+", "+Author);
	}
	
	
}
