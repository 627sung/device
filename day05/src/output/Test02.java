package output;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
   public static void main(String[] args) {
	//Scanner 도구 사용하여 사용자에게 입력받기 
	 // -글자를 모아서 입력을 받아준다.
	   // - 자료형을 원하는 형태로 입력받을 수  있다. 
	   
	  Scanner sc = new Scanner(System.in); //생성
	  
	int a =  sc.nextInt(); // 숫자가 입력
	 System.out.println(a);
	 
	 int b =  sc.nextInt(); // 숫자가 입력
	 System.out.println(b);
	 
	 
	 sc.close(); //종료  close ->내가 사용한 도구를 종료하는 명령  
	 
	
	 
	 
	 
	   
   }
	}
