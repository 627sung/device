package oop.inherit6;

public class Iphone11 extends Iphone {
	
	public void call() {
		System.out.println("Iphone11의 전화 기능을 실행합니다.");
	}
	
	
	@Override
	public void airDrop() {
		System.out.println("Iphone11의 에어드랍 기능을 실행합니다.");
	}
	
	public void siri() {
		System.out.println("Iphone11의  음성인식(siri)기능을 실행합니다.");
	}
	
	
	
}
