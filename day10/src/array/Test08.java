package array;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
				//사용자에게 10개의 숫자를 입력받앗다 .짝수 홀수 구분하여 출력하여라
		       
		
		
				//짝수합계
		Scanner sc =new Scanner(System.in);   
		
		
		int[] input  =new int[10];
		
	for(int i = 0; i<10; i ++) {
		System.out.println((i+1)+"번째 숫자입력");
		 input[i] = sc.nextInt();

	}
		
		
	for(int i =0; i <10; i ++ ) {
		if(input[i]%2 ==0) {
			System.out.println(input[i]+" 짝수");
		}else {
			System.out.println(input[i]+" 홀수");
		}
	}	
		
		
	
		
		
	}

}
