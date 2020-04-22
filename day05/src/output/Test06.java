package output;
import java.lang.*;
import java.util.Scanner;
public class Test06 {

	public static void main(String[] args) {
		/// 국어 영어 수학 점수 입력 받아 평균을 구하는 프로그램 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수입력");
		int korean = sc.nextInt();
		System.out.println("영어점수입력");
		int english = sc.nextInt();	
		System.out.println("수학점수입력");
		int math = sc.nextInt();
		sc.close();
		
		//계산
		int sum = korean+english+math; //점수총합
		double avg = (double)sum/3;
	
		//소수섬 2자리 이하 절삭
		avg= avg*100;  // avg *=100
		avg=(int)avg;  //
		avg=avg/100;
		
		
		
		//출력
		System.out.println("총점은 "+sum+ "점 입니다.");

		System.out.println("평균은 "+avg+ "점 입니다.");
		
	
		
		
		
	}

}
