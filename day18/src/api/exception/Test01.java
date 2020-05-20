package api.exception;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
	
	//상황 1 : 1/n 계산기 .......
	
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
}
