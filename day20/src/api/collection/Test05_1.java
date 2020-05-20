package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test05_1 {
public static void main(String[] args) {
	//List 형태의 저장소를 만들어서 로또 번호를 6개를 저장한뒤 출력 
	
	//로또번호 6개를 저장하라는 말은 .add()를 6개가 될때까지 하라는 의미
	Random r = new Random();
	
	
	List<Integer> a = new ArrayList<>();

	
	
	while(a.size()<6) {
		int n = r.nextInt(45)+1;  //랜덤값을 뽑아서
		if(!a.contains(n)) {    //a에없다면
			a.add(n);              //추가해 
		}
	}
	
	
	System.out.println(a);
	
	
	
	
}
}
