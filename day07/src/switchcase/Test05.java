package switchcase;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
		// 추첨을 1000명을 한다.  
		//1등 1명
		//2등 3명
		//3등 10명
		// 나모지 다음기회에 
		
		Random r = new Random() ;		
		int raffle =r.nextInt(1000)+1;  //1~1000까지 랜덤뽑기
		String check;
		if(raffle==1) {
			check ="1등 최고급 세단";
		}else if (raffle<5) {
			check ="2등 최고급 컴퓨터";
		}else if (raffle < 15) {
			check = "3등 태블릿";
		}else {
			check = "꽝 다음 기회에";
		}
		
		System.out.println(check);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
