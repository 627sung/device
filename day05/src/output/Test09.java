package output;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇시간 충전 하십니까?입력해주세요");
		int inputTime = sc.nextInt();
		
		System.out.println("얼마를 투입하십니까 입력하세요");

		int inputMoney = sc.nextInt();
		
		
		sc.close();
		
		
			int totalHour = ((inputTime*60+inputTime*10)/60);
			int totalMin =  ((inputTime*60+inputTime*10)%60);
			
			int Changes = (inputMoney-(inputTime*1000));

			
			System.out.println("충전된 시간은"+totalHour+"시간" + totalMin+"분 입니다" );
			System.out.println("거스름돈은" +Changes+ "원 입니다" );
			
			
	
	
		
	}

}
