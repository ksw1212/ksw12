package pk11;

public class Paprika extends Vegetable{

		private String color;
		private int price;
		private String name;
		
		public void Set3(String color, int price, String name) {
			this.color=color;
			this.price=price;
			this.name=name;
		}
		public void Disp2() {
			System.out.println("------Paprika-----");
			System.out.println(sort);
			System.out.println(season);
			//super : 기본생성자를 통해서 객체생성
			System.out.println(super.name);
			
			System.out.println();
			System.out.println("------Paprika-----");
		}
		public void Disp3() {
			System.out.println(color);
			System.out.println(price);
			System.out.println(name);
		}
		

	
}
