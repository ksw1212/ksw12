package pk8;

public class Can {
	
	private String canName;//음료 이름
	private int price; //음료 가격
	
	//생성자
	public Can(String canName,int price) {
		this.canName=canName;
		this.price=price;
	}

	public Can() {
		// TODO Auto-generated constructor stub
	}


	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
