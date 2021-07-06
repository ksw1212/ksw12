package pk20;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		//has a
		StringConcatlmp concat1 = new StringConcatlmp();
		concat1.makeString(s1, s2);
		//lambda
		StringConcat concat2 = (s, v) ->System.out.println(s + " , " + v);
		concat2.makeString("Looka", "Bomba");
		
		//익명의 클래스
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				String a = null;
				String b = null;
						
				System.out.println(a.concat(b));
				
			}
		};
		concat3.makeString("Gd7", "김덕배");
	}

}
