package basic;
import java.lang.*;
public class Test16 {
	public static void main (String []args) {
		String a = "hello";
		System.out.println(a);
		
		//참조형 :ex 리모콘... 실제로 돌아가는곳은 따로있다. 그저 사용하기위한 것일뿐 (주문제작) 
		// 크기를 몰라서 그때그떄 가서 만든다.  호출하는 개념
		// 리모콘만 가지고 원래의 형태는 알 수 없다. 원래 제품 딱보면 몰라 크기를 모를때쓴다. 
		 //원시형  어떤걸 담을 수 있는 변수  딱 보면 아는거  크기를 알 수 있을때 ->크기가 고정되면 속도가 빠르다.(기성품)
		 // 맞춤옷과 기성품의 차이 ... 기성품은 빠르다   맞춤옷은 느리다 .
		
		System.out.println(a.length()); //글자수 체크
		System.out.println(a.toUpperCase());
		System.out.println(a.charAt(0));
	
		//나는 "피자"가 먹고 싶어요 
		String p = ("나는 \"피자\""
				+ "가 먹고 싶어요");
		System.out.println(p);
		
		// \는 escape문자이다. 단독으로 쓰이지 않으며 반드시 무엇인가가 온다. 
		
		String c = "이름\\성별 ";
		String d = "원빈\t남자 ";
		String e = "이나영\t여자 ";
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// \t는 Tap이다 \n은 enter이다 .

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
