package pk20;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		this.name=name;
		this.price=price;
		this.age=age;
	}

	public String getName() {
		
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
}
