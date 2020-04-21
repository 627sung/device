package basic;
import java.lang.*;

import javax.xml.namespace.QName;
public class Test14 {
	public static void main(String [] args) {
		//실수의 기본형태는 double 
		
		float a = 3.14f; //f를 써써 플롯임을 알려줌 
		double b = 3.14;
		System.out.println(a);
		System.out.println(b); 
		
		//float 부동소수점  둥둥 떠다녀~
		 float c = 1.654324613216574f; // 정수처럼 순환형이 아니다.  
		 double d =  1.654324613216574;
		
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(10/3.0); // 정확도가 떨어짐..
		 //Q. long 이랑 float 중에 누가 더 큰다 float 이가 더 크다 
		 
		 float e = 1.5f;
		 long f = (long) e;
		 
		 long g = 10L ; 
		 float h = g ;
		 System.out.println(h);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
