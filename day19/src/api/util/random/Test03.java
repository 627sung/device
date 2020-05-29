package api.util.random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		
		Random r = new Random();
				
		String id1 = "test1234";
		String id2 = "master";
		
		while(true) {
			long time = System.currentTimeMillis() / 5000;//5초
//			System.out.println(time);
			r.setSeed(time + id1.hashCode());
			r.nextInt();r.nextInt();r.nextInt();
			System.out.println(id1 + " : " + r.nextInt(1000000));
			
			r.setSeed(time + id2.hashCode());
			r.nextInt();r.nextInt();r.nextInt();
			System.out.println(id2 + " : " + r.nextInt(1000000));
		}
	}
}
