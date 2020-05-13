package oop.inherit.StarCraft;

public class Zealot extends Protoss  implements GroundUnit{

	@Override
	public void attack() {
		System.out.println("질럿 칼로 쑤셔라");
	}

	@Override
	public void walk() {
		System.out.println("질럿 움직여라");
		//실제 프로그래밍이면 이동 좌표와 속도에 대한것이 들어온다... 
		
	}
	
}
