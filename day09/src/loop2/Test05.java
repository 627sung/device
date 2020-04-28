package loop2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) throws InterruptedException {
		// 타이머딩거
		// 분과 초 가 있는 타이머가 >>사용자가 입력하여 해당시간만큼 메세지가 화면에 출력이 됩니다 . 그후 알림메시지 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하시오0000 형태로");
		int userInput = sc.nextInt(); // 유저가입력
		sc.close();
		int input = (userInput / 100) * 60 + (userInput % 100);

		// System.out.println("분을입력");
		// int a = sc.nextInt(); // 사용자가 입력한 분
		// System.out.println("초를 입력");
		// int b = sc.nextInt();//사용자가 입력한 초
		// int input= a*60 + b; //사용자가 입력한 분 초

		for (int i = input; i > 0; i--) {
			System.out.println(i / 60 + "분" + i % 60 + "초");
			Thread.sleep(1000L);// 1초씩 딜레이 //위험한 명령어 나도 몰라~(throws InterruptedException )을 써준다.

		}
		System.out.println("땡");

	}

}
