package oop.method1;

public class Test03 {
	public static void main(String[] args) {
//		객체 생성
		Menu m1=new Menu();
		Menu m2=new Menu();
		Menu m3=new Menu();
		Menu m4=new Menu();

		m1.setting("아메리카노","음료",1800,true);
		m2.setting("프라푸치노","음료",3500,false);
		m3.setting("파니니","식사",2300,true);
		m4.setting("크로크무슈","식사",3300,false);

//		데이터 초기화
		
		
//		출력
//     m1을 주인공으로하여 output()의 코드를 실행 
		m1.output();
		m2.output();
		m3.output();
		m4.output();



	
	}
}
