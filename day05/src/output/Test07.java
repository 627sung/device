package output;
import java.lang.*;
import java.util.Scanner;
public class Test07 {

	public static void main(String[] args) {
		//닉네임 받는 프로그램 
		 //닉네임의 결과를 출력하는 것입니다. 글자수를 검사합니다. 닉네임 2글자 이상 8글자이하만 옳바르게됩니다.
		//출력 사용자가 입력한 닉네임 닉네임글자수 판정결과
		
		
		//준비
		Scanner sc  = new Scanner(System.in);
		System.out.println("닉네임입력");
        String nickname = sc.next(); // 닉네임을 사용자로부터 받아온다 
		sc.close();
		
		//int namelength =nickname.length(); //닉네임 숫자수 확인
		boolean isright = nickname.length()>=2 && nickname.length() <=8;  //2자이상 8자이하  	 	
		
		//출력
		
		System.out.println(nickname);
		System.out.println("닉네임의 글자수는 : " +nickname.length()); //닉네임 길이는~~ 출력
		System.out.println("판정결과 :" + isright);

		
		
	}

}
