package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test05_1 {
	public static void main(String[] args) {
//		문제 : List를 만들어서 로또번호 6개를 저장
//		- Integer을 저장할 수 있는 List를 생성
		
		List<Integer> a = new ArrayList<>();
		
//		로또번호 6개를 저장하라는 말은 .add()를 6번 하라는 의미
		Random r = new Random();
		
		for(int i=0; i < 6; i++) {
			int n = r.nextInt(45) + 1;
//			if(a에 n이 없으면) {
			if(!a.contains(n)) {
				a.add(n);
			}
			else {
				i--;
			}
		}
		
		System.out.println(a);
	}
}




