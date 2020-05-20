package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07_1 {
	public static void main(String[] args) {

		//준비물 Scanner, List;

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		while (true) {
			System.out.println("사자성어를 입력");
			String input = sc.next();
			if (!list.contains(input) && input.length() == 4) {
				list.add(input);
			} else {
				break;
			}

		}
		sc.close();
		
		
		for(String input :list) {
			System.out.println(input);
		}

	}

}
