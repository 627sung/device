package switchcase;

import java.util.Random;

public class Test04 {
	public static void main (String[] args) { 
		
	Random r  = new Random();
	int month = r.nextInt(12)+1;
		
	int year=2000;
	
  // 윤년 일

	boolean is400 = year % 400 == 0; 
	boolean isNot100 = year % 100 != 0;
	boolean is4 = year % 4 == 0;
	boolean isleaf = is400 || (isNot100 && is4);
	
	int  isday;
    int day;
		if(isleaf) {    // 입력받은 연도가 윤년이면 실행 
			 switch(month) {
			 case 2 :
				 isday =r.nextInt(28)+1 ; 
				 day = 0;
				 break;
			 case 4 : case 6 :case 9 : case 11 :
			   day = 30;
			   break;
			  default:
				  day = 31;
				  break;
			 }
		}else {     // 윤년 아니면 실행
			 switch(month) {
			 case 2 :
				 day =28; 
				 break;
			 case 4 : case 6 :case 9 : case 11 :
			   day = 30;
			   break;
			  default:
				  day = 31;
				  break;
			 } //스위치문끝
		} 	//if문 끝
		
		
		System.out.println(day);
	
		
		
	}
}	
	


