package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03_1 {
	public static void main(String[] args) {
		
		int y = 2020;
		int m = 12;
		int d = 25;
		int d_day = 100;
		
		Calendar c = Calendar.getInstance();
		c.set(y, m-1, d);//월조심
		
		c.add(Calendar.DATE, -d_day);
		
		Date time = c.getTime();//Calendar ---> Date 변환
		Format f = new SimpleDateFormat("y-M-d E");
		System.out.println(f.format(time));
	}
}






