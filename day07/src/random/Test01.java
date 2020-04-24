package random;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		
//	Math.random() 명령을 이용한 랜덤 추출
//		- 1부터 10 사이의 무작위 정수가 뽑히도록 개조
		
		
//				Math.random() 명령을 이용한 랜덤 추출
//				- 1부터 10 사이의 무작위 정수가 뽑히도록 개조
				
				double a = Math.random();
				double b = a * 10;
				int c = (int) b;
				int d = c + 1;
				
				System.out.println("a = " + a);		//0.xxx
				System.out.println("b = " + b);		//0.xxx ~ 9.xxx
				System.out.println("c = " + c);		//0 ~ 9
				System.out.println("d = " + d);		//1 ~ 10
				
//				한줄로 합친다면...
//				int e = (int) (Math.random() * 10개) + 1부터;
				int e = (int) (Math.random() * 10) + 1;
				System.out.println("e = " + e);
			}
		

	
	
	}


