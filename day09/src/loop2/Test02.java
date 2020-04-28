package loop2;
import java. lang.*;
public class Test02 {

	public static void main(String[] args) {
		//목표 1~10까지 화면에 출력
		
		
		int n =1; //선언부  반복에 필요한 숫자를 선언하고 초기화하는 부분 
		while(n<=10) { //조건부 반복에 필요한 조건을 검사
			System.out.println(n);
			n++; // 증 감 부  반복수를 증가 또는 감소시키는 부분 
		}

		//for문을 이용한 구현
//		for(선언부;조건부;증감부){코드}
		for(int i= 1; i<=10; i++) {
			System.out.println(i);
		}
		
	}

}
