package api.lang.etc;

public class Test01 {
public static void main(String[] args) {
	//math 클래스 : 수학 계산을 처리하는 클래스 
	//-생성자가없다 : 잠겨있다.
	//객체생성없이도 static 메소드를 호출하는 방식으로 사용하도록 되어있다.
	
	System.out.println(Math.E) ; //지수상수
	System.out.println(Math.PI); // 원주율 ....
	
	double a =1.5; // 올림하면 2 반올림하면 2 버림하면 1
	System.out.println(Math.ceil(a));//올림
	 System.out.println(Math.round(a));//반올림
	 System.out.println(Math.floor(a)); //버림.. 
	 
	 int b= 20;
	 int c = 10;
	 
	 System.out.println(Math.abs(c-b));  //abs =절대값 구하기 ..
	
	System.out.println(Math.pow(2,10));
	
	System.out.println(Math.sqrt(9)); //루트.....
	
	System.out.println(Math.max(5, 10)); //큰거
	System.out.println(Math.min(5,10)); //작은거 ... 
	
	
	
	
 	
	
	
	
}
}
