package pk10;

public class Bank {

	private String point; //은행의 위치(지점)
	private String tel; // 은행의 전화번호
	static float interest; //은행 이자
	
	//생성자를 활용하여 point 와 tel set
	public Bank(String point,String tel) {
		this.point=point;
		this.tel=tel;
	}
	
	//결과를 출력한 메서드(get)
	public void getBank() {
		System.out.println("지점 : "+ point + "\n"+ 
							"전화번호 : " + tel + "\n"+
							"은행이자 : " + interest);
	}
	
}
