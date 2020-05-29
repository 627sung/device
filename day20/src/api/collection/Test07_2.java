package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07_2 {
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
		
//		게임오버 메시지 출력 후 그동안의 입력 기록(memory)을 출력
		System.out.println("게임 오버");
		
//		for(int i=0; i < memory.size(); i++) {
//			System.out.println(" → " + memory.get(i));
//		}
		
		for(String word : memory) {
			System.out.println(" → " + word);
		}
	}
}













