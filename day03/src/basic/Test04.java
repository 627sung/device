package basic;

import java. lang. *;

public class Test04 {
	
 public static void main (String[] args) {
	 //변수를 사용하여 프로그래밍 
	 // 코어 데이터가 무엇인지를 찾아내야한다. 
	 
	 int dailyPrice = 8000 ; //a라는 이름에 하루요금인 8000원 저장 
	 int term = 30 ;  // b라느 이름에 30일을 저장 
	 int sale = 5000; // c라는 이름에 할인금액 5000원을 저장 
	 
	 int price = dailyPrice*term ; 
	 
	 
	 System.out.println(dailyPrice*term); //할인 전 
	 System.out.println(dailyPrice*term-sale); //할인 후 
	 
	 System.out.println(price); //할인 전 
	 System.out.println(price -sale); //할인 후
 }
}
