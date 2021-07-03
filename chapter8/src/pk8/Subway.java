package pk8;

public class Subway {
	public int money;
	public String lineNum;
	public int passengerCount;
	//heap메모리 생성
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
	public void take(int money) {//승객이 탄경우
		this.money+=money;//수입증가
		passengerCount++;//승객수 증가
	}
	public void showInfo() {//지하철 정보
		System.out.println(lineNum + "의 승객은"+ passengerCount+"명이고 수입은 "+money+"원 입니다.");
	}
}
