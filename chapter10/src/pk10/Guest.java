package pk10;

public class Guest {
	//필드
	private String name;
	private String gender;
	
	public String getPoint() {
		
		//원래는 객체 생성하여 접근해야 하지만 static이므로 클래스명으로 접근
		return Guide.point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
