package pk8;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today=null;
		
		
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK);//일요일 1 ~ 토요일 7
		
		switch(week) {
		case 1:
			today=Week.sunday;
		case 2:
			today=Week.Monday;break;
		case 3:
			today=Week.tuesday;break;
		case 4:
			today=Week.wednesday;break;
		case 5:
			today=Week.thursday;break;
		case 6:
			today=Week.friday;break;
		case 7:
			today=Week.saturday;break;
		}
		System.out.println("오늘 요일: "+today);
		if(today==Week.sunday) {
			System.out.println("일요일 에는 잔다.");
		}else {
			System.out.println("열심히 Java를 공부한다.");
		}
		
		
	}

}
