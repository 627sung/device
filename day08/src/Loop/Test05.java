package Loop;
import java.lang.*;
import java.util.Random;
public class Test05 {
	public static void main(String [] args) {
		
	//주사위를 열번 던지는 코드
		Random  r  = new Random();
		
		
		int n = 0;
		int total= 0;
		while(n<10) {
			int dice = r.nextInt(6)+1; // 1~6까지 랜덤값 출력
			System.out.println("주사위= "+ dice);
			total += dice; // 나온값을 계속 더하여 누적시킴
			n++; // 마지막에 써준다. 할거 다하고 			
		}
		System.out.println("던진 주사위의 총합 =" + total); //누적시켜서 더한값 
		
		
		
		
	}
}
