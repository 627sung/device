package array;

import java.util.Random;

public class Test07_T {

	public static void main(String[] args) {

				//주사위를 한번만 던지자
		
	Random r =new Random();
		
	
	
		int[] count  =new int[6];
	//count--->6개의 공간    [0]  [0]  [0]  [0]  [0]  [0] 
	//                                 0    1     2       3     4     5 
	
		for(int i = 0; i<1000; i++) {
			int dice = r.nextInt(6)+1;
				if(dice ==1) {
					count[0]++;
			   }else if(dice ==2) {
				   count[1]++;
			   }else if (dice ==3) {
				   count[2]++;
			   }else if (dice ==4) {
				   count[3]++;
			   }else if (dice ==5) {
				   count[4]++;	   
				}else if (dice ==6) {
					count[5]++;
				}
			}//for문 닫기	
		
		System.out.println("1나온횟수" +count[0]);
		System.out.println("2나온횟수" +count[1]);
		System.out.println("3나온횟수" +count[2]);
		System.out.println("4나온횟수" +count[3]);
		System.out.println("5나온횟수" +count[4]);
		System.out.println("6나온횟수" +count[5]);
		
	}
	

}
