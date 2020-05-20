package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) {
		
	
		//try 감시구역
		
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
		catch(InputMismatchException e) {
			System.err.println("돈만 숫자로 입력하세요");
		}
		catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "인간수 체크해라 ");;
		}
		
	}
}
