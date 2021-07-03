package pk12;

import Test.Customer;
import Test.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		
		Customer vc = new VIPCustomer(10030, "가나다라마법사", 2000);
		vc.bonusPoint=1000;//Customer타입이므로 Customer변수방 사용
		System.out.println(vc.getCustomerName()+"님이 지불해야 하는 금액은" + 
								vc.calcPrice(10000)+"입니다.");
	}

}
