package array;

import java.util.Scanner;

public class Test08_T {

	public static void main(String[] args) {
				
		
		//입력부분. . 사용자에게 숫자 10개를 입력받아 배열에 저장..........
		 int [] data = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 10개를 입력하세요 ");

		for(int i= 0; i <data.length; i++) {
			data[i] =sc.nextInt();
	
		}
		sc.close();
		int oddTotal =0; // 홀수합계
		int evenTotal = 0; //짝수합계
		
		
		for(int i =0; i < data.length; i++) {
			if(data[i]==2) { // 현재값이 짝수면 
				evenTotal +=data[i];
			}
			else {
				oddTotal +=data[i];
			}
		}
			//홀수와 짝수의 합 ....
		System.out.println("홀수합= "+oddTotal);
		System.out.println("짝수합= "+evenTotal);

		
		for(int i =0; i<data.length; i++) {
		        if(data[i]%2!=0) {
		        	System.out.println("홀수="+data[i] );
		        }
		}       
		        
		for(int i =0; i<data.length; i++) {
		  if(data[i]%2==0) {
				System.out.println("짝수="+data[i] );	    	
		  }
		        	
		        	
		 }
	
		
	}
	
		
}


