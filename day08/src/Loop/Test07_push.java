package Loop;
import java .lang.*;
public class Test07_push {
	public static void main (String [] args ) {
		
		//30동안 다이어트를 한다 
		//첫날에는 푸쉬업을 10 개 그다음날부터는 전날보다 3개더 
		//일자별로 하는 푸쉬업수
		// 30일동안하는 푸쉬업수 
		
		int  push = 10;
		int day = 1;
		int total = 0;
		while(day<31) {
			System.out.println(day + "일차 " +push+ "개");
			System.out.println(total);
			total = total+  push;
			push = push +3;
			day++ ;

		}
				System.out.println("30일동안 하게되는 푸시업의 수 =" + total);
		
		
		
		
		
		
		
	}
	
	
	
	
}
