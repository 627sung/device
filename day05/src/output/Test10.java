package output;
import java.lang.*;
import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("몇잔 주문하십니까?");
		
		int coffeCount = sc.nextInt();
		
		sc.close();
		
		
		

		int coffePrice = 1500; //커피가격
		int freeCoffee = coffeCount/7 ; // 제공되는 꽁짜커피 
		
		int totalPrice = coffeCount*coffePrice; //  커피 가격 
		int totalCoffeeCount =  coffeCount * coffePrice ; //총 커피가격 
		
		
		System.out.println("무료제공되는 커피는 " +  freeCoffee+ "잔입니다"); 
		System.out.println("총 결제금액  " + totalCoffeeCount + "원 입니다" );
		
	}

}
