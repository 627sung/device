package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		Date d = new Date();
		
//		2020년 5월 15일 금요일
		Format f1 = new SimpleDateFormat("y년 M월 d일 E요일");
		
//		오후 1:39
		Format f2 = new SimpleDateFormat("a h:mm");
		
//		13:39
		Format f3 = new SimpleDateFormat("HH:mm");
		
//		2020-05-15 13:39:40
		Format f4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(f1.format(d));
		System.out.println(f2.format(d));
		System.out.println(f3.format(d));
		System.out.println(f4.format(d));
		
		while(true) {
			Date t = new Date();
			System.out.println(f4.format(t));
			
			try {
				Thread.sleep(1000L);
			} catch (Exception e) {}
		}
	}
}





