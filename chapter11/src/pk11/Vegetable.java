package pk11;

public class Vegetable {
	
	String sort;
	String season;
	String name;
	
	public void Set1(String sort, String season, String name) {
		this.sort=sort;
		this.season=season;
		this.name=name;
	}
	public void Disp1() {
		System.out.println(sort);
		System.out.println(season);
		System.out.println(name);
	}
}
