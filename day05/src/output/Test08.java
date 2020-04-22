package output;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		
		System.out.println("연도를 입력");
		
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		
		sc.close();
		
		
		
		
		
		//계산
		
		boolean isleapYear = year%4 == 0 && year%100 != 0 || year %400==0 ;  
				
		System.out.println("결과는 " + isleapYear + "입니다");
		
		
		
		
		
	}

}
