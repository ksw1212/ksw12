package pk15;

public class EqualsTest {

	public static void main(String[] args) {
		Student st1 = new Student(1, "홍길동");
		Student st2 = new Student(2, "임꺽정");
		Student st3 = st1;
		System.out.println("동일한 주소의 두 인스턴스 비교");
		if(st1==st3) {
			System.out.println("같습니다.");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st3));
		}else {
			System.out.println("주소는 다릅니다.");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st3));
			}
		if(st1.equals(st3)) {
			System.out.println("같습니다");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st3));
		}else {
			System.out.println("다릅니다");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st3));
		}
		System.out.println("다른주소의 두 인스턴스 비교");
		if(st1 ==st2) {
			System.out.println("같습니다.");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st2));
		}else {
			System.out.println("다릅니다.");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st2));
		}if(st1.equals(st2)) {
			System.out.println("같습니다");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st2));
		}else {
			System.out.println("다릅니다");
			System.out.println(System.identityHashCode(st1));
			System.out.println(System.identityHashCode(st2));
	}
		System.out.println("st1 hash : " +st1.hashCode());
		System.out.println("st1 hash : " +st2.hashCode());

}
}
