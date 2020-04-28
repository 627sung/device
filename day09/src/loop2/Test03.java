package loop2;
import java.lang.*;
public class Test03 {

	public static void main(String[] args) {
	
		System.out.println("정수");
		for(int i =1; i<=100; i ++ ) {
			System.out.println(i);
		}
		
		System.out.println("홀수");
		for(int i =1; i<=100; i ++ ) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
		
		System.out.println("3의배수");
		for(int i=1; i<=100; i++) {
			if(i%3 ==0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("대문자 알파벳만 출력(1)");
		for(int i=65; i <=90; i++) {   //아스키코드 몰르면 못함 ... 
		System.out.println  (( char)i);
		}
		
		
		System.out.println("대문자 알파벳만 출력(2)");
		for(char i='A'; i <='Z'; i++) {     //아스키코드를 몰라도 쌉가능
		System.out.println(i);
		}
		
	
		
		
		//한글은   3부분으로 이루어져 있음 ... ㄱ .. ㅎ.. ㅏ... ... ㅣ 모여있음 //  가 ....힣 모여있음  
		System.out.println("한글출력");
		for(char i = '가';  i <='힣'; i++) {
			 System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
