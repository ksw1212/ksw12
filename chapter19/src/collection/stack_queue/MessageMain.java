package collection.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {
		Queue<Message> message = new LinkedList<Message>();
		message.offer(new Message("sendmail", "임꺽정"));
		message.offer(new Message("sendSNS", "홍길동"));
		message.offer(new Message("sendKKO", "우투리"));
		
		while(!message.isEmpty()) {
			Message mes = message.poll();
			switch(mes.command) {
			case "sendmail":
				System.out.println(mes.to+" 메일");
				break;
			case "sendSMS":
				System.out.println(mes.to+" SNS");
				break;
			case "sendKKO":
				System.out.println(mes.to+" 카카오톡");
				break;
			
			}
		}

	}

}
