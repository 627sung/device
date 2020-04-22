package output;
import java.lang.*;
public class Test08T {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		준비
		int year = 2020;
		
//		계산
		boolean is400 = year % 400 == 0; 
//		System.out.println(is400);
		boolean isNot100 = year % 100 != 0;
//		System.out.println(is100);
		boolean is4 = year % 4 == 0;
//		System.out.println(is4);
		
//		결과
		System.out.println(is400 || isNot100 && is4);
//		System.out.println(true);
		

	}

}
