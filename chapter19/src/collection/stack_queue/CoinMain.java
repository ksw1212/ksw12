package collection.stack_queue;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(1));
		System.out.println(coinBox.peek().getValue());
		coinBox.push(new Coin(2));
		System.out.println(coinBox.peek().getValue());
		coinBox.push(new Coin(3));
		System.out.println(coinBox.peek().getValue());
		//coinBox.pop();
		//System.out.println(coinBox.peek().getValue());
		//coinBox.pop();
		//System.out.println(coinBox.peek().getValue());
		//coinBox.pop();
		//while(!coinBox.isEmpty()) {
		//	Coin coin=coinBox.pop();
		//	System.out.println("꺼내온 동전 : " + coin.getValue());
		//}
		

	}

}
