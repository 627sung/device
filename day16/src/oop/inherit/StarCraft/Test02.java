package oop.inherit.StarCraft;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
//		public static void main(String[] args) {
//		지상유닛을 랜덤으로 10마리 생성하여 이동명령을 실행
		GroundUnit[] data = new GroundUnit[10];
		
		for(int i=0; i < data.length; i++) {
			data[i] = UnitFactory.generateGroundUnit();
		}

		for(int i=0; i < data.length; i++) {
		data[i].walk();
//			data[i].walk();
		}
		
//		공중유닛을 랜덤으로 10마리 생성하여 비행명령을 실행
//		테란유닛을 랜덤으로 10마리 생성하여 공격명령을 실행
		
		
	}
}