package pk12;

public class AnimalExample {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Lion l = new Lion();
		Bear b = new Bear();
		Spider s = new Spider();
		System.out.println("---사자---");
		System.out.println(l.getEye());
		System.out.println(l.getLeg());
		System.out.println("---곰---");
		System.out.println(b.getEye());
		System.out.println(b.getLeg());
		System.out.println("---거미---");
		System.out.println(s.getEye());
		System.out.println(s.getLeg());
		
	}
}
