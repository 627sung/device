package Loop;

import java.lang.*;

public class Test10_T {

	public static void main(String[] args) {

		int n = 1;
		int count = 0;

		while (n < 100) {

			if (n / 10 == 5 || n % 10 == 5) { // 나머지가 5인 경우와 몫이 5인경우

				count++;
			}

			n++;
		}

		System.out.println(count);

	}

}
