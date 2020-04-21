package basic;
import java.lang.*;
public class Test12 {

	public static void main(String[] args) {
		//성적평균 계산기 
		//국어는 75 수학 80 평균출력하기 ... 소수점있는 숫자 구하기 
		int kor = 75, math = 80;
		
		
		double avg = (kor + math) / 2.0 ;
		  //실수가 포함된 연산은 결과가 실수이다 . 
		// 나눗셈시 소수점이 필요하다면 한쪽은 실수로 처리해줘야한다. 
		
		double avg2 =  (kor + math) / (double) 2;
		// 2앞에 double을 붙여서 소숫점이 필요한 계산임을 컴퓨터에게 알림 
		
		System.out.println(avg);
		System.out.println(avg2);
		
		
		
		
		
		
	}

}
