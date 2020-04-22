package basic;
import java.lang.*;
public class Test19_t {

	public static void main(String[] args) {
			//준비
 		  //성인요금 청소년요금 성인수 청소년수 할인률
		int adultPirce = 10000;
		int teenPirce = 7000;
		int adultCount = 2 ;
		int teenCount = 3 ; 
		
		// 계산 : 성인요금(원),청소년요금(원), 총요금(원), 할인요금(원) 다 int다 
		int adultTotal = adultPirce  * adultCount;
		int teentotal = teenPirce * teenCount;
		
		int total = adultTotal+teentotal;
		int discount = total * 25 / 100;
	//	int discount = (int) (total * 0.25)
		
		int result = total - discount;
		//result = result /100 * 100;  //뒤에 100원단위를 쳐내는 방법 //
		result = (result+50) /100 * 100;  //뒤에 100원단위를 쳐내는 방법 //
		//result = (result+99) /100 * 100;  //뒤에 100원단위를 쳐내는 방법 //
		
		System.out.println(result);
		
		 
		
		
		
		
		
		
		
		
		//계산
		
		
		
		
		
		//출력
		System.out.println(30700);
		
		
		
		
	}

}
