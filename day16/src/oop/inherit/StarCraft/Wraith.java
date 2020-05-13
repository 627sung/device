package oop.inherit.StarCraft;

public class Wraith extends Terran implements FlyingUnit {

	@Override
	public void attack() {
		System.out.println("레이스 레이저로 뿅뿅");
	}

	@Override
	public void fly() {
		System.out.println("레이스 날아가라");
		
	}

}
