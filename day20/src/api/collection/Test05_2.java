package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test05_2 {
	public static void main(String[] args) {
//		문제 : List를 만들어서 로또번호 6개를 저장
//		- Integer을 저장할 수 있는 List를 생성
		
		List<Integer> a = new ArrayList<>();
		
//		로또번호 6개를 저장하라는 말은 .add()를 6개가 될때가지 하라는 의미
		Random r = new Random();
		
//		while(6개가 뽑히지 않았다면) {
		while(a.size() < 6) {
			int n = r.nextInt(45) + 1;		//랜덤값을 뽑아서
			if(!a.contains(n)) {				//a에 없다면
				a.add(n);							//추가해!
			}
		}
		
		
		System.out.println(a);
	}
}




