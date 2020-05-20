package api.exception;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		// 사람에게 자장면과 짬뽕그릇수르르 입력받아 합계가격을 계산하는 프로그램
		// 짬봉 3000원 짱개 2500원
		Scanner sc = new Scanner(System.in);

	try {

		System.out.println("짜장(5000)  수량 입력");
		int a = sc.nextInt();
		System.out.println("잠봉(5500)  수량 입력");

		int b = sc.nextInt();
		
		if(a+b<0) {
			throw new Exception("최소 한그릇은 시키셔야 합니다. ");
			
		}
		
		

		sc.close();
		
		int total = a*5000+b*5500;
		System.out.println(total);

	}catch(Exception e) {
		System.err.println(e.getMessage());
		e.printStackTrace();
		
	}

		
	

		
	}
}
