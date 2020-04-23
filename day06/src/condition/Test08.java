package condition;
import java.lang.*;
import java.util.Scanner;
public class Test08 {

	public static void main(String[] args) {
		
//		2의배수 인가 3의배수인가;;?
//		6 3 2 1 전부 결과가 다르다 .
//		 이숫자는 ~의 배수다. 
//  1의 경우 2와3의 배수가 아니다   2의 경우 2의 배수이다 3의경우 3의배수이다.  6의 경우 3의 배수이면서 6의배수이다.
		
		
		Scanner sc = new Scanner(System.in);
		int inputNum  = sc.nextInt(); //사용자가 주는숫자

		sc.close();
		
				
				
		 if (inputNum%2 ==0 && inputNum%3 ==0) {
			 System.out.println( "2와 3의 배수입니다.");
		 }
		 else if (inputNum%2 ==0) {
			 System.out.println( "2의배수입니다.");

		 } else if (inputNum%3 ==0) {
			 System.out.println( " 3의배수입니다.");
		 } else {
			 System.out.println( "아무것도 아닙니다.");
		 }
				
				
		
		
		
		
		
		

	}

}
