package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {

		
		//Set 과 List 
		//Set은 전화번호부처럼 특정방식에 의해 분류되는 저장소 
		//List는 통화목록 처럼 순서가 중요한 저장소 
	Set a = new TreeSet();
	List  b = new ArrayList();
		
	
	a.add("조인성"); //a라는 저장소에 조인성을 추가하여라
	b.add("조인성"); // b라는 저장소에 조인성을 추가하여라 
	
	a.add("한효주"); //a라는 저장소에 한효주를 추가하여라
	b.add("한효주"); // b라는 저장소에 한효주를 추가하여라 
	
	a.add("아이유"); //a라는 저장소에 한효주를 추가하여라
	b.add("아이유"); // b라는 저장소에 한효주를 추가하여라 
	
	a.add("공유"); //a라는 저장소에 한효주를 추가하여라
	b.add("공유"); // b라는 저장소에 한효주를 추가하여라 
	
	a.add("수지"); //a라는 저장소에 한효주를 추가하여라
	b.add("수지"); // b라는 저장소에 한효주를 추가하여라 
	
	a.add("수지"); //a라는 저장소에 한효주를 추가하여라
	b.add("수지"); // b라는 저장소에 한효주를 추가하여라 
	
	a.add("수지"); //a라는 저장소에 한효주를 추가하여라
	b.add("수지"); // b라는 저장소에 한효주를 추가하여라 
	
	
	
	
	
	System.out.println(a);
	System.out.println(b);
	
	
		
		
	}

}
