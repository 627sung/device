package Loop;

import java.util.Random;

public class Test04 {
	public static void main (String [] args) {
		
		//주사위를 5번 던져보세요    안부터 만들고 겉으로 감싸라. 
		
		
		//1번의 주사위 결과 출력 코드 
		
		Random r = new Random();
		
		int n = 0;
		while(n<5) {
			
			int dice = r.nextInt(6)+1;
			System.out.println("주사위의 눈 "+dice);
			n++;
		
		}

	}
}
