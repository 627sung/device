package oop.static2;

public class Test01 {

		public static void main(String[] args) {
			//Robot을 이용하여 10+20을 계산
			// Robot안에 정적 메소드로 plus 를 만들어놨다.
			
			
			int v = Robot.Plus(10, 20);
			System.out.println("v= "+v);
			
			
		}
}
