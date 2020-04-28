package loop2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// do - while문 (do문)
		// 최소 1번은 실행한다. 선실행 후검사를 실행하는 구문 ..
		Scanner sc =new Scanner(System.in);

		// 구문이 어려워서 최근에는 잘 안쓰는 추세임 
		
		
		int score;
		do {
		System.out.println("시험성적입력");
		 score = sc .nextInt();
		}
		while(score <0 || score >100);{
			
		}
		
		
		sc.close();
		
		
		
		
	}

}
