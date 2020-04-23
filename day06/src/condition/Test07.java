package condition;
import java.lang.*;
import java.util.Scanner;
public class Test07 {

	public static void main(String[] args) {

		System.out.println("당신의 출생년도입력");
		Scanner sc = new Scanner(System.in);
		int birth = sc.nextInt();

		sc.close();
		int age = 2020 - birth + 1;
		int dp = 500;

		String divide;
		int price;
		if (age >= 65) {
			divide = "어르신";
			price = 0;
		} else if (age >= 20) {
			divide = "성인";
			price = 1250;
		} else if (age >= 14) {
			divide = "청소년";
			price = 720;
		} else if (age >= 8) {
			divide = "어린이";
			price = 450;
		} else {
			price = 0;

			divide = "유아";
		}
					 
		int totalPrice = price + dp;

		System.out.println("당신은" + divide);
		System.out.println("요금은" + price + "원");
		System.out.println("보증금포함 요금은 " + totalPrice + "원입니다");
	
	
		
	}

}
