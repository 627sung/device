package oop.inherit;

public class Test01 {
	public static void main(String[] args) {
  //하위클래스 Galaxy Iphone Xiaomi 들의 객체 생성 후 기능 사용
		// 그 떄 과연 직접 만든것과 같은 구조인지??
		
		
		Galaxy a= new Galaxy();
		a.version="20s";
		a.number="010-1212-3444";
		a.call();
		a.camera();
		a.sms();
		
		Iphone b= new Iphone();
		b.version="XS";
		b.number="010-3554-7892";
		b.call();
		b.camera();
		b.sms();
		
	
		
		
		
		
	}
}
