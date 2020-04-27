package Loop;

import java.util.Random;

public class Test04 {
	public static void main (String [] args) {
		
		//주사위를 5번 던져보세요 
		
		Random r = new Random();
		
		
		int i = 0;
		while(i<5) {
			int dice = r.nextInt(6)+1;
			System.out.println(dice);
			i++;
		}
		
		
		
		
		
		
	}
}
