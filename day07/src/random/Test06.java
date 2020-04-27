package random;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;
public class Test06 {

	public static void main(String[] args) {
//구구단       

		Random r = new Random();

		int n = r.nextInt(8) + 2;
		int i = r.nextInt(9) + 1;

		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 유저가 입력
		System.out.println("땡");
		System.out.print("풀어보시오  " + n + "*" + i + "=");
		int ans = (n * i); // 랜덤으로 숫자받아서 곱한 결과
		sc.close();

		if (ans == input) { // 랜덤숫자와 사용자 입력값 비교
			System.out.println("정답");
		} else {
		}
		
		
		
		
	}
}

