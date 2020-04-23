package condition;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
int month = 3;
		
//		String season = "봄" or "여름" or "가을" or "겨울";
		String season;
		
//		int rate = 20 or 0 or 5 or 30;
		int rate;
		
		if(month / 3 == 1) {
			season = "봄";
			rate = 20;
		}
		else if(month / 3 == 2) {
			season = "여름";
			rate = 0;
		}
		else if(month / 3 == 3) {
			season = "가을";
			rate = 5;
		}
		else {
			season = "겨울";
			rate = 30;
		}
		
		System.out.println(season+" 여행을 예약하시면 "+rate+"% 할인됩니다!");
	}

}
