package pk8;

public class StdInfo {
	
	public String studentName;
	public int grade;
	public int money;
	
	
	//생성자(오버로딩) studentName 고 Money
	StdInfo(String studentName, int money){
		this.studentName=studentName;
		this.money=money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
	}
	public void takeSubway(Subway sub) {
		sub.take(1500);
		this.money-=1500;
	}
	public void showInfo() {
		System.out.println(studentName+"님은 남은돈은" + money+"입입니다.");
	}
	
}
