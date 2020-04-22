package basic;
	import java.lang.*;
public class Test21 {
	
	public static void main(String[] args) {

		///아무 글자나 하나 char 형태에 저장하시고 문제를 푸세요.
		//(1) 저장한 값이 "숫자"라면 true , 아니라면 false를 출력
		//(2) 저장한 값이 "한글"이라면 true, 아니라면 false를 출력
				
				char a = '1';   //(1)
 				char b = '2' ;  //(2)
				boolean check1 = a >=48 && a<=57;        //a가 숫자안의 범위면 true값 출력.,범위외는 false 출력
				boolean check2 = b>=12593 && b<=55203;   //a가 한글안의 범위면 true값 출력 ,범위외는 false 출력
				
				
				System.out.println(check1);
				System.out.println(check2);
				
				
				
				
				

		
		
	}

}
