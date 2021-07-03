package pk15;

class BK{
	String title;
	String author;
	
	public BK(String title,String author) {
		this.author=author;
		this.title=title;
	}

	@Override
	public String toString() {
		
		return author + ", " + title;
	}
	
}

public class ToStringEx2 {

	public static void main(String[] args) {
		BK bk =new BK("김진명","고구려");
		System.out.println(bk);
		System.out.println(bk.toString());
	}
	
	
}
