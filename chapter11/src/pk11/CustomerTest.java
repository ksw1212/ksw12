package pk11;

public class CustomerTest {

	public static void main(String[] args) {
		
		//일반고객 정보(Customer)
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이길동");
		
		int price = 10000;
		customerLee.calcPrice(price);
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("-------------------------------------");
		VIPCustomer vip = new VIPCustomer(1, "홍길동", 1);
		int vipprice = 10000000;
		vip.calcPrice(vipprice);
		System.out.println(vip.showCustomerInfo());
		System.out.println(vip.getCustomerName());
	}
}
