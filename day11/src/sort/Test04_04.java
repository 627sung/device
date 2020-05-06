package sort;

import java.util.Random;

public class Test04_04 {

	public static void main(String[] args) {

		Random r = new Random();

		int size = 5;
		int[][] bingo = new int[size][size];

		// 랜덤한 위치를 설정하여 1을 대입

		for (int i = 1; i <= 25; i++) {
			int x = r.nextInt(5) + 0;
			int y = r.nextInt(5) + 0;
			if (bingo[x][y] == 0) {
				bingo[x][y] = i;
			} else {
				i--;
			}
		}

		// 출력
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
