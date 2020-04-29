package array;

import java.util.Random;

public class Test07_T2 {

	public static void main(String[] args) {

				//주사위를 한번만 던지자
		
	Random r =new Random();
		
	
	
		int[] count  =new int[6];
	//count--->6개의 공간    [0]  [0]  [0]  [0]  [0]  [0] 
	//                                 0    1     2       3     4     5 
	
		for(int i = 0; i<1000; i++) {
			int dice = r.nextInt(count.length)+1;
				count[dice-1]++;
				
			}//for문 닫기	
		
		
		
		
		for(int i =0; i <count.length; i++) {
			System.out.println((i+1)+"나온횟수" +count[i]);

			
		}
		
		
		
		
		
		
	}
	

}
