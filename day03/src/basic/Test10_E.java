package basic;
import java.lang.*;
public class Test10_E {
	public static void main(String[] args){

		//준비
		
		int	enterHour =10, enterMin = 45;
		int outHour = 17, outMin = 20;
		int price = 500;
		int enterTime = (enterHour*60 + enterMin );
		int outTime = (outHour*60+outMin) ;
		int parkingTime = (outTime-enterTime);
		
		//계산
		
		
		int totalPrice  = (parkingTime/10) *price;
		//출력
		System.out.println(totalPrice);
			
		}
}
