package condition;

import java.util.Scanner;

public class Test04_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
				
		
		//boolean isSpring = month>=3 && month <=5;
		boolean isSpring = month >=3 && month <=5;
		boolean isSummer = month >=6 && month <=8;
		boolean isAutumn = month >=9 && month <=11;
		boolean isWinter = (month ==12 || month <=2) && month !=0;
		

		
		
		if(isSpring) {
			System.out.println("봄은 20% 할인이요");
		}
		
		if(isSummer) {
			System.out.println("여름은 0% 할인이요");
		}
		
		if(isAutumn) {
			System.out.println("가을은 5% 할인이요");
		}
		
		if(isWinter) {
			System.out.println("겨울은 30% 할인이요");
		}
		
		
	}

}
