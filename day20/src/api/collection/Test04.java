package api.collection;

import java.util.List;
import java.util.ArrayList;

public class Test04 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// 데이터추가. add()

		list.add(3);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(4);

		
		
		
		//5가 들어있습니까?
		
		 System.out.println(list.contains(5));
		 
		 
		 //3을 지워보세용 또는 2번에 위치에 있는놈을 지워요
		 list.remove(1);  //1번위치가 지웠습니다. 
		 
		 //내용물 꺼내기 get~ 
		 System.out.println(list.get(0)); //0번째 값 가져와~~
		 
		 //마지막 데이터 내놔!!
		 System.out.println(list.get(list.size()-1)); //0번째 값 가져와~~

		 
		 
		//데이터의 개수를 확인 
		System.out.println(list.size());
		System.out.println(list);

	}
}
