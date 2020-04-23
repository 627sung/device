package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {

		System.out.println("시험점수를 입력하세요 ");
		
		Scanner sc = new Scanner (System.in);
		
		int  score = sc.nextInt();
		sc.close();
		
		
		if(score >=60) {
			System.out.println("통과입니다.");
		} 
		
		if(score <=60) {
			System.out.println("재평가입니다");
		}
		
		
		
		
		
		
		
		
		
	}

}
