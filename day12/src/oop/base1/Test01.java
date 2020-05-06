package oop.base1;

public class Test01 {
	public static void main(String[] args) {
		//message를 생성(객체생성 코드)
		Message a = new Message();// 객체(object)
	
		
		//설정
		a.sender="엄마";
		a.content="밥은 먹고 다니냐?";
		a.when="오후 11시 30분";
		a.remain=1;

		
		
		
		
		//출력 
		System.out.println(a);

		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.when);
		System.out.println(a.remain);

	
	
	
	}
}
