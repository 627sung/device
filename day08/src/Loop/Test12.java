package Loop;
import java.lang.*;
import java.util.Random;

public class Test12 {

	public static void main(String[] args) {

		// 주사위를 열번 던지는 코드
		Random r = new Random();

		int total = 0;
		int count = 0;

		while (true) {
			int dice = r.nextInt(6) + 1; // 1~6까지 랜덤값 출력
			total += dice; // 나온값을 계속 더하여 누적시킴
			System.out.println("주사위= " + dice);
			System.out.println("던진 주사위의 합 =" + total);
			count++;  //주사위를 던진뒤에 카운트를 올린다. 
			if (total >= 50) {
				break;
			}

		}

		System.out.println("총 던진 주사위의 수는 ="+ count);

	}
}
