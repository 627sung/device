package oop.inherit.StarCraft;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {

		Random r = new Random();

		Overlord c = new Overlord();
		Wraith d = new Wraith();

		System.out.println("지상유닛을 10마리 생성 이동명령 ");

		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(2);
			if (n == 0) {
				Zealot z = new Zealot();
				z.walk();
			} else {
				SCV s = new SCV();
				s.walk();
			}
		}
		
		System.out.println("");

		System.out.println("공중유닛 랜덤 10마리 생성 비행명령");
		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(2);
			if (n == 0) {
				Overlord o = new Overlord();
				o.fly();
			} else {
				Wraith w = new Wraith();
				w.fly();
			}
		}

		System.out.println("");

		
		System.out.println("테란유닛을 10마리 생성 공격명령 ");

		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(2);
			if (n == 0) {
				SCV s = new SCV();
				s.attack();
			} else {
				Wraith w = new Wraith();
				w.attack();
			}
		}

		System.out.println("");

		
		
	}
}
