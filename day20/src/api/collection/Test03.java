package api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
//		List : 순서가 존재하는 저장소(하위 클래스 중 아무거나 생성하면 됨)
//		 - 내용물의 형식을 지정할 수 있는 방법을 제너릭(Generic)이라 한다.
		
//		List<String> a = new ArrayList<String>();//배열의 형태를 띈 List
//		List<Integer> a = new ArrayList<Integer>();
//		List<Boolean> a = new ArrayList<Boolean>();
		List<String> a = new ArrayList<>();
		
//		추가 : add()
//		a.add(100);//int
//		a.add(true);//boolean
//		a.add(1.5);//double
		a.add("hello");//String
		
		System.out.println(a);
	}
}






