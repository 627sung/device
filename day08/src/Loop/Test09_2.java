package Loop;

import java.util.Random;
import java.util.Scanner;

public class Test09_2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner  sc = new Scanner(System.in);
		
		
		//경품의 당첨될 확률은 2/100  백개중에 2개 
		
		//당첨
		// 숫자 1 2가 나오면 당첨 
		System.out.println("추첨할 횟수를 입력하시오 ");
		 int count =0;
		 int n = 1;
		 int input = sc.nextInt() ;  //사용자가 횟수를 직접입력
		sc.close();
		while (n<=input) {  // 사용자가 입력한 수만큼 추첨을 돌린다. 
		int lot = r.nextInt(100)+1;  //100개 중 한개 뽑기
		
			if(lot<=2) {    // 1과 2면 당첨이고 input값이 1과 2이면 if문을 충족한다. 
				count++;    // 당첨ㅇ
			}
			 
			n++;
		}
		System.out.println("당첨된횟수는 =" + count);
		
		
		
	}

}
