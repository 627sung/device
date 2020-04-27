package Loop;

import java.util.Random;
import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// 설정해야할것
		int comNum = r.nextInt(1000) + 1;   //1~1000까지 랜덤으로 골라짐
		System.out.println("컴퓨터가 문제를 설정했어요 맞춰보십시요");
		int count = 0;
		while (true) {
			int inputNum = sc.nextInt(); // 사용자가 넣는 숫자
			count++;
			if (comNum == inputNum) {      //정답시
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
