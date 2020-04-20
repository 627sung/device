package basic;
import java. lang.*;
public class Test07 {
	public static void main(String[] args) {
		/*생일은 8자리 정수로 표기합니다. (예 19990315)
		1.출생년도 1999
        2.월 03 
        3.일	15
        4.나이(한국식)	 22
	*/
	int birthday = 19990315;
	int Year =  birthday/10000;
	int Day =  birthday%100 ;
	int Month = ( birthday%10000 -Day) /100 ;
	int Month2 = ( birthday%10000 -Day) /100 ;
    int age = 2020-Year+1;
	System.out.println(Year); 
	System.out.println(Month);
	System.out.println(Day);
	System.out.println(age);
	

	
	
	
	
	
	}

}
