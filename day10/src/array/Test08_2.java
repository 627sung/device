package array;

import java.util.Scanner;

public class Test08_2 {

	public static void main(String[] args) {
				//사용자에게 10개의 숫자를 입력받앗다 .짝수 홀수 구분하여 출력하여라
		       
		
		
				//짝수합계
		Scanner sc =new Scanner(System.in);   
		
		
		int[] input  =new int[10];
		
	for(int i = 0; i<10; i ++) {
		System.out.println((i+1)+"번째 숫자입력");
		 input[i] = sc.nextInt();

	}
		
		int total1 =0;
		int total2 = 0;
	for(int i =0; i <10; i ++ ) {
		total1 =input[i];
		total2 =input[i];
		if(input[i]%2 ==0) {
				System.out.println(input[i]+" 짝수");
				total1=total1+input[i];
		}else {
			System.out.println(input[i]+" 홀수");
			total2 =total1+input[i];

		}
	}	
		System.out.println("짝수합" +total1);
		System.out.println("홀수합"+total2);

		
		
	
		
		
	}

}
