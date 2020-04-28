package loop2;

import java.lang.*;

public class Test07 {

	public static void main(String[] args) {

		// 그리스의 현명한노인이있었다.. 원하는 선물을 말해봐라 노인이 말하길 첫날에 1원주시고요 둘째날부터 전날의 2배를 주십쇼
		/// 40일 달동안 이노인이 받게된 돈의 액수 총 얼마 받는지

		long money = 1;
		long total = 0;
		for (int day = 1; day <= 40; day++) {

			System.out.println(day + "일차" + money + "원");
			total+=money;   // 오늘자  금액을 더해야 한다. 
			money *= 2;
		}
		System.out.println("노인이 받는돈은 ="+total+"원");
	}

}
