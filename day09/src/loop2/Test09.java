package loop2;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		
			int n =1000;
		for(int j =1; j*j <=n; j++)	{
			int count =0;
			for(int i = 1; i <=j; i++  ) {
				if(j% i ==0) {
					 count++;
					 break;
				 }// if문 괄호
					
			} //for문 괄호 (  소수이면 카운트 2시키는  for 문)
		
				if(count ==0) {
					System.out.println(j);
				}
			
		}	
		
	}
}