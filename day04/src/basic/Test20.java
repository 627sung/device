package basic;

import java.util.Calendar;

public class Test20 {

	public static void main(String[] args) {
		int birthday = 20010715; //출생년도
		int year = birthday/10000; //년도
		int thisyear = 2020;      //올해년도
				
		int age = thisyear - year+1 ; //나이 = 작년년도 - 올해 +1;
		boolean check = age >=20;  //체크
				
		
		System.out.println(check);
		
	}

}
