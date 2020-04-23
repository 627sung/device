package condition;
import java.lang.*;
import java.util.Scanner;
public class Test07 {

	public static void main(String[] args) {
		// 사용자에게 태어난년도 4자리를 입력받아 카드 비용 발급하도록구현
// 어르신 (65세이상) 0원
// 성인 	(20 ~64) 1250
// 청소년 (14~20) 720		
// 어린이(8~13)
// 유아(7)	
		//카드 보증금은 500원
		
		
		
		System.out.println("출생연도 4자리를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int birthyear = sc.nextInt(); //입력받는값
		sc.close();
		
		
		
		int thisyear= 2020; 
		int age = thisyear - birthyear+1;
		int price;
		int deposit = 500;
		String division;
	
		
		if( age>=65) {
			price =0; 
			division = "어르신";
		} 
		else if (age>=20 && age <=64) {
			price = 1250;
			division = "성인";
		}else if (age >=14 && age<=19 ) {
			price =720;
			division = "청소년";
		}else if (age>=8 && age <= 13) {
			price = 450;
			division = "어린이";
		}else {
			price = 0;
			division = "유아";

		}
		int totalPrice = price + deposit;

	
				
		System.out.println( "당신은 " + division + "입니다" );
		System.out.println( "운임료는 " + price +"입니다");
		System.out.println( "보증금은 " + deposit +"입니다");
		System.out.println( "운임료와 보증금을 더한금액은 " +totalPrice+"입니다.");

		
		
	}

}
