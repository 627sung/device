package api.util.calendar;

import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {
//		Calendar 클래스
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		정보 설정 : .set(무엇을, 얼마로)
//		c.set(Calendar.YEAR, 2000);
		c.set(2000, 0, 1);//월 조심!
		
//		정보 확인 : .get(무엇을)
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1;//0 ~ 11
		System.out.println(month);
		
//		int day = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		
//		int hour = c.get(Calendar.HOUR);//12시간
		int hour = c.get(Calendar.HOUR_OF_DAY);//24시간
		System.out.println(hour);
		
		int minute = c.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = c.get(Calendar.SECOND);
		System.out.println(second);
		
		//요일
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
	}
}







