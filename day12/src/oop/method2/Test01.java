package oop.method2;

public class Test01 {

	public static void main(String[] args) {

		//생성
		user m1= new user();
		user m2= new user();
		user m3= new user();
		//설정
		m1.setting("뽀로로","전사",50,50000);
		m2.setting("마리오", "전사", 45, 65000);
		m3.setting("루이지","전사",53,70000);

		//출력
		m1.output();
		m2.output();
		m3.output();

		
	}

}
