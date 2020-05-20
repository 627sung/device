package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test3 {
	public static void main(String[] args) {
		
	
		//예외 통합처리;
		
		try {
			Scanner sc =new Scanner (System.in);
			System.out.println("금액입력");
			long price = sc.nextLong(); //여기서 미스매치 오류 발생 
			
			System.out.println("인원수입력");
			int people =sc.nextInt();
			
			sc.close();
			
			
			long a= price/people;   
			long b= price%people;
			
			
			System.out.println("한명당"+a+"원");
			
			System.out.println("남은돈"+b+"원");
		}
		catch(Exception e) {
			if(e.getMessage()==null) {
				System.err.println("오류발생");
			}else {
	       System.out.println(e.getMessage()); //원인메시지 출력
			}
		
		e.printStackTrace(); // 예외로그의 출력 (개발용 ) -만드는사람이 보기 편하려고 배포시에는 삭제바람 ..
	}

}
}