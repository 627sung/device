package random;
import java.lang.*;
import java.util.Random;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		//주사위를 1개 던진다.  1 2 3 4 5 6 
		// 1 부터 6까지
		// 1 부터 6개
	
		int  dice = r.nextInt(6/*개*/)+1/*부터*/;   //1부터 6개 
		System.out.println("주사위 "+dice);
		
	
		int  lotto = r.nextInt(45/*개*/)+1/*부터*/;   //
		 System.out.println("로또 " + lotto) ;
		 
		// 1 부터 45까지
		// 1 부터 45개 
		 
		 int essence = r.nextInt(90/*개*/)+10/*부터*/;
			System.out.println("두자리정수는 " +essence);
			
			// 10 부터 99까지
			// 1 부터 90개
			 
			
		 int otp = r.nextInt(1000000/*개*/);
		 	System.out.println("otp번호는 " +otp);
			
		 // 000000 부터 999999까지
		 // 0 부터 1000000 개
			
			
		
		
		
		
	}

}
