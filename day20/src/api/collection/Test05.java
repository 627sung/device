package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {
public static void main(String[] args) {
	//List 형태의 저장소를 만들어서 로또 번호를 6개를 저장한뒤 출력 
	Random r = new Random();
	
	
	List<Integer> a = new ArrayList<>();
	System.out.println(a);
	
		for(int i =0 ; i<6; i++){
		a.add(r.nextInt(45)+1);
		}

	
	
	
	
	
	System.out.println(a);
	
	
	
	
}
}
