package api.util.calendar;

import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {
		
		int y = 2020;
		int m = 12;
		int d = 25;
		int d_day = 100;
		
		Calendar c = Calendar.getInstance();
		c.set(y, m-1, d - d_day);//월조심
		
//		정보 확인 : .get(무엇을)
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1;//0 ~ 11
		System.out.println(month);
		
//		int day = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		
		//요일
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
	}
}
