package Loop;

import java.util.Random;

public class Test11 {
	public static void main(String[] args) {
		// while문 시점으로 제한 (언제까지 )

		// 주사위가 5가 나올때까지 던져라 ......

		Random r = new Random();
		int count = 0;

		while (true) {
			int dice = r.nextInt(6) + 1; // 주사위 던지기 .
			System.out.println("주사위" + dice);
			 count++; // 던지고 나서 증가시킨다.
			if (dice == 5) { // 주사위가 5라면
				break; // if 를 제외한 가장 가까운 지역을 ( {} ) 을 탈출하라.
			}
		}
		System.out.println("주사위를 던진횟수는 = " + count);
	}

}
