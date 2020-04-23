package condition;
import java.lang.*;
public class Test03__ {

	public static void main(String[] args) {
		
		int score1 = 50;
		int score2 = 70;
		
		double avg =  (score1 + score2) /2.0;
		
		//통과할것이라고 예상하고 못하는 상황이 되면 값을 반환   
		
		boolean isPass = true ;
		
		if(avg < 60) {
			isPass = false;
		}
	
		if(score1 < 40) {
			isPass = false;
		}
		if(score2 < 40) {
			isPass = false;
		}
		
	
	
		
		
	System.out.println(isPass);	
	System.out.println("통과입니다");
	System.out.println("재평가입니다");
		

	}

}
