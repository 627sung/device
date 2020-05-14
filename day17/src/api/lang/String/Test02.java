package api.lang.String;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	

	System.out.println("아이디, 비밀번호 입력");
	 String id = sc.next();
	 String pw = sc.next();
	 sc.close();
	 
	 
	 if(id.equalsIgnoreCase("Khacademy") && pw.equals("student")){
		 System.out.println(" 로그인 성공");
	 } else {
		 System.out.println("로그인실패");
	 }
		
	 
	//배열만들기 .......
	 //data가 6개이다 .. 만들수 있는 방법은 3가지가 있다 
	 //아이디 배열,비밀번호배열
	 //2차원 배열  
	 //객체가 3명이있다..... 클래스가 3개 .... 클래스 하나 만들어서 배열에 저장하는것이 베스트 ...
	 
	 
	 
	 
	 
	 

	 
	 
	 
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
}
