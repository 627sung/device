package Loop;

import java.util.Random;
import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// 설정해야할것
		int comNum = r.nextInt(1000) + 1; // 컴터가 만든 숫자 제일 마지막에 설정합니다.
		System.out.println("컴퓨터가 문제를 설정했어요 맞춰보십시요");
		int count = 0;
		while (true) {
			int inputNum = sc.nextInt(); // 내가 넣은 숫자
			count++;
			if (comNum == inputNum) {
				System.out.println("정답!  프로그램종료");
				break;

			} else if (comNum > inputNum) {
				System.out.println("숫자가 더 커야합니다.");
			} else if (comNum < inputNum)
				System.out.println("숫자는 더 작아요 ");

		}
		System.out.println("총" + count + "번 만에 맞추셨습니다.");
	}

}
