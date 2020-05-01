package array;

import java.util.Random;

public class Test12 {

public static void main(String[] args) {
		
		String[] data = new String[] {"자바" ,"파이썬", "자바스크립트", "루비", "C#"};
		
		Random r = new Random();
		
//		계산
		for(int i=0; i < data.length; i++) {
			int n = r.nextInt(data.length);
			
//			System.out.println("n = " + n);
			while(i == n) {//같으면 다시 뽑는다
				n = r.nextInt(data.length);
//				System.out.println("n = " + n);
			}
			
//			System.out.println(i + "번 위치와 " + n + "번 위치를 교환");
			
			String tmp = data[i];
			data[i] = data[n];
			data[n] = tmp;
		}
		
//		출력
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}