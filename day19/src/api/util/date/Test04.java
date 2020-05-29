package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
//		Date를 이용한 시간 계산
//		- 안좋음
		Date today = new Date();
//		today.setDate(today.getDate() + 5);
//		System.out.println(today);
		
		long t = today.getTime();//System.currentTimeMillis()와 동일
		long a = t + 5 * 24 * 60 * 60 * 1000;
		Date after = new Date(a);
		Format f = new SimpleDateFormat("y-M-d");
		System.out.println(f.format(after));
	}
}








