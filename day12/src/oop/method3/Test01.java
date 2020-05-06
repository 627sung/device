package oop.method3;

public class Test01 {
	public static void main(String [] args) {
		
		
		
		//기기생성
		Arcade a1=new Arcade();
		Arcade a2=new Arcade();
		Arcade a3=new Arcade();

		//정보설정
		a1.setting("스노우맨",300);
		a2.setting("보글보글",500);
		a3.setting("철권",1000);

		//플레이 전 상태 
		a1.output();
		a2.output();
		a3.output();
		
		
		
		//게임을 이용하는것과 동일한 처리를 수행하는 코드 
		
		//1.철권15판을 한경우의 a3의 상태를 변화;
		//>income 이 15000원 증가해야함.
		//>income 1000원*15판 증가해야한다.
		 //a3.income+=1000*15;
		 a3.play(15);

		 //2.보글보글 12판
		 a2.play(12);

		
		 //3.스노우맨 30판
		 a1.play(30);

		 
		//플레이 후 상태 .
		a1.output();
		a2.output();
		a3.output();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
