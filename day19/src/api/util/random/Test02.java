package api.util.random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time / 72000);
		
//		Random r = new Random(?);
		Random r = new Random();
		r.setSeed(time / 72000);
		
		System.out.println(r.nextInt(1000000));
	}
}
