package oop.inherit.StarCraft;

import java.util.Random;

public class UnitFactory {
	
	public static GroundUnit generateGroundUnit() {
		Random r = new Random();
		int a = r.nextInt(2);//질럿(0), SCV(1)
		
//		GroundUnit unit = 질럿 or SCV;
		GroundUnit unit;
		if(a == 0) {
			unit = new Zealot();//up-casting(Zealot -> GroundUnit)
		}
		else {
			unit = new SCV();//up-casting(SCV -> GroundUnit)
		}
		return unit;
	}
}