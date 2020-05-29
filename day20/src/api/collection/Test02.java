package api.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test02 {
	public static void main(String[] args) {
//		List : 순서가 존재하는 저장소(하위 클래스 중 아무거나 생성하면 됨)
		List a = new ArrayList();//배열의 형태를 띈 List
		List b = new CopyOnWriteArrayList();//Blocking ArrayList(동기화)
		List c = new LinkedList();//연결 형태의 List
		
//		추가 : add()
		a.add(100);//int
		a.add(true);//boolean
		a.add(1.5);//double
		a.add("hello");//String
		
		System.out.println(a);
	}
}






