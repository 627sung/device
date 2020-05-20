package api.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test08 {
	public static void main(String[] args) {
		//List는 순서를 중요시여긴다. 순서와 관련된 명령이 많다. 
		//Collections 라는 유틸 클래스에 명령들이 존재한다. 
		// -순서대로정렬
		//-순서를 뒤집어라 
		//-순서를 뒤섞어라 .
		
		List<Integer> n = new LinkedList<>(); //up=casting
		
		for(int i =1; i<=10; i++) {
		n.add(i);
		}
	
		
	System.out.println(n);
	
	System.out.println("리버스!");
	Collections.reverse(n);
	System.out.println(n);
	
	System.out.println("셔플!");
	Collections.shuffle(n);
	System.out.println(n);
	
	Collections.sort(n);//정렬 
	System.out.println(n);
	
	
	
	
	
	
	
	}
}
