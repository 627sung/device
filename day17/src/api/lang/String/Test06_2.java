package api.lang.String;

import java.util.Scanner;

public class Test06_2 {

	public static void main(String[] args) {
		// 불필요한 단어: 신발끈 , 개나리, 수박씨, 호루라기,시베리아,십장생,조카,주옥,쌍쌍바,십자수
		// 입력예시가 이런 개나리같은 신발끈 같은 호루라기야 ...
		// 결과 예시 이런 ***같은 *** ****야 불필요한 단어는 **로 표현

		String data[] = new String[] { "신발끈", "개나리", "수박씨", "호루라기", "시베리아", "십장생", "조카", "주옥", "쌍쌍바", "십자수" };

		Scanner sc = new Scanner(System.in);

		System.out.println("문장입력");
		String input = sc.nextLine();

		sc.close();

		System.out.println(input);
		// 필터링

		for (int i = 0; i < data.length; i++) {

			if (data[i].length() == 2) {
				input = input.replace(data[i], "**");
			} else if (data[i].length() == 3) {
				input = input.replace(data[i], "***");
			} else {
				input = input.replace(data[i], "****");
			}

		}

		// 출력
		System.out.println(input);

	}

}
