package Loop;
import java . lang.*;
public class Test07_01T {

	public static void main(String[] args) {
				
		
		int day = 1;
		int pushup = 10 ;
		while(day<31) {
		System.out.println(day+"일차 :"+pushup);
		
		day++; //날짜가 변하고 푸쉬업의 수가 증가 	
		pushup +=3;
		}
	}

}
