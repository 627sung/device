package Loop;

import java.util.Random;

public class Test09_1 {

	public static void main(String[] args) {

		Random r = new Random();

		// 경품의 당첨될 확률은 2/100 백개중에 2개

		// 당첨
		// 숫자 1 2가 나오면 당첨
		int count = 0;
		int n = 1;

		while (n <= 30) { // 30번추첨
			int lot = r.nextInt(100) + 1; // 100개 중 한개 뽑기

			if (lot <= 2) { // 1과 2면 당첨이고 당첨횟수를 센다.
				count++;
			}

			n++;
		}
		System.out.println("당첨된횟수는 =" + count);

	}

}
