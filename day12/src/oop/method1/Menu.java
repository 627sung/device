package oop.method1;

public class Menu {
	// 멤버필드(데이터저장)
	String name;
	String type;
	int price;
	boolean isEvent;

	// 멤버 메소드(코드 저장)
	//this는 현재객체(나 자신)을 의미
	void output() {
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.isEvent);

	}
	//(  )안에는 외부에서 전달되는 데이터를 저장할 변수를 선언 
	//-->매개변수 
	// -->메소드 실행을 위한 준비물....
	void setting(String a ,String b, int c , boolean d) {
		this.name = a;
		this.type = b;
		this.price = c;
		this.isEvent = d;
		
	}
	
	
	
	
	
	
}