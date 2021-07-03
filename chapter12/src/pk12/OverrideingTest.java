package pk12;

import Test.Customer;
import Test.VIPCustomer;

public class OverrideingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"홍길동");
		customerLee.BonusPoint=1000.0;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("--------VIP---------");
		VIPCustomer vip = new VIPCustomer(1,"임꺽정",1);
		vip.BonusPoint=10000;
		System.out.println(vip.showCustomerInfo());
		int price = 10000;
		System.out.println(customerLee.getCustomerName()+"님이 지불하셔야 할 금액은 "+ 
															customerLee.calcPrice(price)+"원 입니다.");
		System.out.println(vip.getCustomerName()+"님이 지불하셔야 할 금액은 "+ 
				vip.calcPrice(price)+"원 입니다.");
		
		
		
	}

}
