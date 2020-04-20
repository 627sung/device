package basic;
import java. lang. *;
import java.util.Calendar;
public class Test07_2 {

	public static void main(String[] args) {
		/*생일은 8자리 정수로 표기합니다. (예 19990315)
		1.출생년도 1999
        2.월 03 
        3.일	15
        4.나이(한국식)	 22
	*/
		
		
	int birthday = 19990315;
	
	
	//계산
	int year = birthday / 10000; // 네자리를 버린후 왼쪽값을 알아낸다 
	int month = birthday / 100 % 100; // 두자리버린후 오른쪽 두자리
	int day = birthday % 100; // 오른쪽 두자리 
	//올해 연도 구하기
	int thisyear = Calendar.getInstance().get(Calendar.YEAR);
	
	int age = 2020 - year +1;
	
    
    
    //출력
    System.out.println(year); 
	System.out.println(month);
	System.out.println(day);
	System.out.println(age);

	
	
	
	
	}

}
