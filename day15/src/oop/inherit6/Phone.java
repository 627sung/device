package oop.inherit6;

public class Phone {

	protected String number;
	
	public void call() {
		System.out.println("전화 기능을 실행합니다.");
	}
	public void sms() {
		System.out.println("문자기능을 수행합니다.");
	}
	
	public void output() {
		System.out.println("번호:"+number);
	}
	
}
