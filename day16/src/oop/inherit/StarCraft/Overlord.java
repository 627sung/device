package oop.inherit.StarCraft;

public class Overlord extends Zerg implements FlyingUnit{

	@Override
	public void attack() {
		System.out.println("오버로드 도망가라");
	}

	@Override
	public void fly() {
		System.out.println("오버로드 날아가라");
	}

}
