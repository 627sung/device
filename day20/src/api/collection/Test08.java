package api.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test08 {
	public static void main(String[] args) {
//		List는 "순서"를 중요시 여기기 때문에 순서와 관련된 명령이 많다
//		- Collections 라는 유틸 클래스에 명령들이 존재
//		- 순서대로 정렬
//		- 순서를 뒤집어라
//		- 순서를 뒤섞어라
		
		List<Integer> n = new LinkedList<>();
		
		for(int i=1; i <= 10; i++) {
			n.add(i);
		}
		
		System.out.println(n);
		
		Collections.reverse(n);//뒤집기
		System.out.println(n);
		
		Collections.shuffle(n);//셔플
		System.out.println(n);
		
		Collections.sort(n);//정렬
		System.out.println(n);
	}
}





