package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		// 사자성어 게이ㅁ;
		// 사용자가 사자성어를 입력받은 뒤 저장소에 저장합니다. 중복금지!!!
		// 중복금지!!! 이미저장한 내용이 입력된다면 게임오버요
		// 게임오버시 입력한 모든 사자성어를 출력

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		System.out.println("사자성어를 입력하시오 ");

		while (true) {
			String input = sc.next();
			if (!list.contains(input) && input.length() == 4) {
				list.add(input);
			} else {
				break;
			}

		}
		sc.close();
		System.out.println("탈락");
		System.out.println(list);

	}

}
