package pk20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelTest {

	public static void main(String[] args) {
		List<TravelCustomer> customerlist =new ArrayList<TravelCustomer>();
		TravelCustomer customerko = new TravelCustomer("고길동", 40, 100);
		TravelCustomer customerme = new TravelCustomer("메갓", 34, 10000);
		TravelCustomer customerkim = new TravelCustomer("김덕배", 30, 100);
		customerlist.add(customerkim);
		customerlist.add(customerko);
		customerlist.add(customerme);
		System.out.println("==고객 명단 추가된 순서대로 이름 출력==");
		//각 객체의 요소중 이름만 mapping하여 출력함
		customerlist.stream().map(c->c.getName()).forEach(s->System.out.print(s+" "));
		System.out.println();
		//customerlist.stream().forEach(s->System.out.println(s));
		int total = customerlist.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println(total);
		System.out.println("--20세 이상의 고객을 정렬하여 이름 출력--");
		customerlist.stream().filter(a-> a.getAge()>=40).map(b->b.getName()).sorted().forEach(s->System.out.println(s));
	}

}
