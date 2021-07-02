package collection.stack_queue;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> queueList = new ArrayList<String>();
	
	public void enQueue(String data) {
		queueList.add(data);
	}
	public String deQueue() {
		int len=queueList.size();
		if(len==0) {
			System.out.println("Queue가 비었습니다.");
			return null;
		}
		return queueList.remove(0);
	}
	
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.enQueue("D");
		for(int i=0;i<5;i++)
		System.out.println(queue.deQueue());
		

	}

}
