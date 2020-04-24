package random;
import java .lang.*;
import java.util.Random;
public class Test02 {

	public static void main(String[] args) {
		// 랜덤값 추출 

		Random r = new Random();
		
		
		int a = r.nextInt();  // (인트범위내 랜덤 )
		System.out.println(a);
		
		int b = r.nextInt(10 /*개*/) + 1 /*부터*/;
		System.out.println(b);
		
		
		
	 	
	}

}
