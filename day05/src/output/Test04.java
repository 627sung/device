package output;
import java. lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main (String[] args) {
		//Scanner(문자열) 입력
		//-단어 입력 : 스페이스,엔터등의 공백기준 next
		//- 문장 입력 : 엔터 기준  nextline
		Scanner sc = new Scanner(System.in); //입력도구사용
		System.out.println("이름 입력");
		String name = sc.next();
		
		System.out.println("입력하신 이름은 "+name);
		
		sc.nextLine(); //엔터제거
	
		System.out.println("문장입력");
		String line = sc.nextLine();
		
		System.out.println(line);
		
		
		
		
		
		sc.close(); //종료 
		
		
		
		
	}
}
