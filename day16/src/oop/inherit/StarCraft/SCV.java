package oop.inherit.StarCraft;

public class SCV extends Terran  implements GroundUnit, Worker{

	@Override
	public void attack() {
		System.out.println("SCV 용접기로 지이이잉");
		
	}

	@Override
	public void mine() {
		System.out.println("SCV 자원캐라");
		
	}

	@Override
	public void walk() {
		System.out.println("SCV 움직여라");
		
	}
	
	
}
