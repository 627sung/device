package condition;
import java.lang.*;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
//		사용자에게 숫자를 하나 입력받아서 다음을 검사하려고 합니다.
//
//		2의 배수
//		3의 배수
//		가능한 모든 경우를 파악하여 조건을 이용하여 판정 결과를 화면에 출력하세요
// 2의배수이면서 3의배수인경우  2의배수인경우 3의 배수인경우 아무것도 아닌경우 
		
		 System.out.println("체크하고싶은 숫자입력");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;

		sc.close();
		
		
		String str;
		if(n%2 ==0  && n%3 ==0) {
			str="6의배수입니다";
		}else if(n%2 ==0) {
			str = "2의배수입니다.";
		}else if(n%3 ==0) {
			str = "3의배수입니다";
		}else {
			str = "아무것도 아닙니다.";
		}
				
		System.out.println(str);
		
		
				
		
		
		
		
		
	
	}
	
	

}
