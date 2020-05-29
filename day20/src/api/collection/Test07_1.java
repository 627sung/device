package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07_1 {
	public static void main(String[] args) {
//		준비물 : Scanner, List<String>
		
		Scanner sc = new Scanner(System.in);
		List<String> memory = new ArrayList<>();
		
		while(true) {
			System.out.println("사자성어 입력");
			String word = sc.nextLine();
			
			if(!memory.contains(word)) {//memory에 word가 없을 때
				memory.add(word);//word를 memory에 추가
//				System.out.println(memory);
			}
			else {
				break;
			}
		}
		
		sc.close();
	}
}





