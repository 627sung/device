package loop2;

import java.lang.*;

public class Test06 {

	public static void main(String[] args) {
		// 3 6 9 시뮬레이터 ....
		// 3 6 9에 해당하면 박수를 쳐라 ......
		// 박수는 3 6 9 개수대로 칩니다. 1부터~99까지 369할때 예상되는 패턴 출력

		for (int i = 1; i < 100; i++) {

			if ((i % 10 == 3 || i % 10 == 6 || i % 10 == 9) && (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
				System.out.println("짝짝");
			} else if ((i % 10 == 3 || i % 10 == 6 || i % 10 == 9) || (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
	}

}
