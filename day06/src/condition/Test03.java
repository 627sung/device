package condition;
import java. lang.*;
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		//한과목에 시험을 두번본다.. (서술형 ,실습형)
		//두과목의 평균이 60점 이상이면 통과
		//한과목이라도 40점 미만이라면 재평가 
		//두과목의 평균이 60점 미만이라도 재평가 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("서술형 점수입력");
		int Narrative = sc.nextInt(); 
		System.out.println("실습형 점수입력");
        int  Practice = sc.nextInt() ;
		sc.close();
		
		
		
		double avg = (Narrative+ Practice)/2;
		boolean isPass = (avg>=60 && avg <=100) && (Narrative >=40 && Practice >=40);
				
		
		
		
		
		if(isPass == true) {
			System.out.println("합격입니다.");
		}
		
		if(isPass !=true) {
			System.out.println("재평가입니다.");
		}

		
		
		
		
		
		
	}

}
