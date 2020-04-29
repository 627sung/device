package array;

import java.util.Random;

public class Test07 {

	public static void main(String[] args) {
		// 배열문제 위치가지고 장난 count 합계가지고 장난 
		// 주사위를 1000번던진다 ... (각각의 값이 몇번 나왔는지 체크해보시오)
		// 배열활용하기 
		//1. 주사위 던지기 1000번하자 
		
		Random r =new Random();
		
		int n= 1000;  //주사위를 던질 횟수...
		int[] data =new int[n]; 
	

		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		
		for(int i = 0; i <data.length; i++) {
			data[i] = r.nextInt(6)+1;
			  if(data[i]==1) {
				  count1++;
			  }else if(data[i]==2) {
				  count2++;
			  }else if(data[i]==3){
				  count3 ++;
			  }else if(data[i]==4){
				  count4++;
			  }else if(data[i]==5) {
				  count5++;
			  }else {
				  count6++;
			  }
			}
		
	System.out.println("1은" +count1+"개");
	System.out.println("2은" +count2+"개");
	System.out.println("3은" +count3+"개");
	System.out.println("4은" +count4+"개");
	System.out.println("5은" +count5+"개");
	System.out.println("6은" +count6+"개");

		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
