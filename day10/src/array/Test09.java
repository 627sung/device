package array;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
			//시험점수 관리 프로그램.......
		// 우리반학생들의 시험성적이 다음과 같습니다....... 
		//{70 85 92 66 72 88 92 70 81 93 }
		//우리반 학생들의 평균 점수 구하기..
		//등수 구하기    제일잘해서 1등 == 나보다 점수높은사람들 카운트해서  0명
		Scanner sc = new Scanner(System.in);
		int[] score = new int[] {70,85,92,66,72,88,92,70,81,93};
		System.out.println("현재학생수는"+score.length);
		//평균
		
		
		
		
		//평균 구하기
		int total = 0;
		for(int i =0; i <score.length; i++) {
				total +=score[i];
			}

		int avg =  total/score.length;
		System.out.println("평균 ="+avg);  
	
	//사용자의 데이터입력
		System.out.println("점수입력하면 등수가 나와요 ");
		int input = sc.nextInt(); //사용자가 점수입력 
		sc.close();
		
		
	/// 등수구하기 	
		int count = 0;
	for(int i =0 ; i<score.length; i++) {	
	
		if(input<score[i]) {
			count ++;
		}
	}	
	
	//점수 입력받아서 등수 출력 
	
	for(int i =0 ; i<score.length; i++) {	
	      if(count==i) {
	    	  System.out.println((i+1)+"등");
	      }
	}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
