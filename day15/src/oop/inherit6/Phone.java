package oop.inherit6;
//추상적인 클래스 
public class Phone {

	protected String number;
	
	public void output() {
		System.out.println("번호:"+number);
	}
	
	public void call() {
		System.out.println("전화 기능을 실행합니다.");
	}
	
	
}
