package condition;
import java.lang.*;
public class Test09_ {

	public static void main(String[] args) {
		// 들어온 시간 구하기
		
		int inHour = 6;
		 int inMIn = 11;
		int outHour = 7;
		int outMin = 52;
		 
		int parkTime =(outHour*60+outMin)   - (inHour*60 + inMIn);
		System.out.println(parkTime);
		 int time = parkTime-30;
		int price;
		
		if(parkTime>=121) {
			price=10000;
		}else {
			price = (time/10)*1000 ;
		}
		
		
		System.out.println(price);
		
	}

}
