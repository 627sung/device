package Loop;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 영원히 실행되는 구구단 문제

		Scanner sc = new Scanner(System.in); //도구이므로 한번만 선언해줘도 쌉가능
		Random r = new Random();					///도구이므로 한번만 선언해줘도 쌉가능
		System.out.println("정답을입력하시오 ");

		while (true) { // while을 연다.

			int n = r.nextInt(8) + 2; // 2~9까지
			int j = r.nextInt(9) + 1; // 1~9 까지
			System.out.println(n + "*" + j + "=");
			int input = sc.nextInt();
			
			
			if (j * n == input) {
				System.out.println("정답");
			} else {
				System.out.println("땡");
			}
		} // while을 닫는다.

	} //메소드 닫음 

} //class  닫음
