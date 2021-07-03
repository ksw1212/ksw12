package pk8;

public class TakeTrans {

	public static void main(String[] args) {
		StdInfo studentJames = new StdInfo("James", 5000);
		StdInfo studentJames2 = new StdInfo("James", 10000);
		StdInfo studentTomas = new StdInfo("Tomas", 10000);
		StdInfo studentTomas2 = new StdInfo("Tomas", 3000);
		
		Bus bs100 = new Bus(100);
		studentJames.takeBus(bs100);
		studentTomas2.takeBus(bs100);
		bs100.showInfo();
		Subway subgreen = new Subway("2호선");
		studentTomas.takeSubway(subgreen);
		studentJames2.takeSubway(subgreen);
		subgreen.showInfo();//지하철 정보
		studentJames.showInfo();//학생정보
		studentTomas.showInfo();
		studentJames2.showInfo();
		studentTomas2.showInfo();
	}
	
	

}
