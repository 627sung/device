package output;
import java. lang.*;
public class Test01 {
	public static void main (String [] args) {
		//표준 출력 - 표준출력  통로 (System.out)을 이용하여 값을 내보내는 작업 
		
		
		//내부글자를 있는 그대로 출력한다.  계속이어진다. 
		System.out.print("안");
		System.out.print("녕");

		//글자를 출력한뒤 엔터를 추가하는 명령
		System.out.println("반가워요");
		System.out.println("잘부탁한다");

		//단점 : 이어서 출력하고 싶다면 +를 해야한다. (문자열)
		
		
		int age = 10 ; 
		System.out.println("당신의 나이는 ");
		System.out.println("당신의 나이는 " + age +"살입니다.");
		
		System.out.println("10년뒤 당신은" + (age +10) +" 살 입니다" );
	
		
		
		
		
		
		
		
		
	}
}
