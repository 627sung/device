package basic;
import java.lang.*;
public class Test08_1 {

	public static void main(String[] args) {
		//입력
		int yesHour = 3 , yesMin = 20;
	    int todayHour = 2 , todayMin = 50 ;
		 
	    
	    //계산
		//어제공부한 시간(분), 오늘 공부한 시간(분),합계,차이	
		int yesTime  = yesHour * 60 + yesMin ;
	   // System.out.println(yesTime);
		int todayTime =  todayHour * 60 + todayMin ;
		 // System.out.println(todayTime);

		int total = yesTime + todayTime;
		int gap = yesTime - todayTime;
		
		
		
	    
	    //출력
	    
		System.out.println("합계");
		System.out.println(total/60);
		System.out.println(total%60);
		
		System.out.println("차이");
		System.out.println(gap/60);
		System.out.println(gap%60);
		
		
		
		
	}

}
