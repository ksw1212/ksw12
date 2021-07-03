package pk9;

public class KoreaExample {

	public static void main(String[] args) {
		Korea KR = new Korea("김승우", "123456-123456789");
		System.out.println(KR.name);
		System.out.println(KR.ssn);
		System.out.println(KR.nation);
		
		Korea k3 = new Korea();
		System.out.println(k3.name);
		System.out.println(k3.ssn);
		System.out.println(k3.nation);
	}

}
