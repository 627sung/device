package condition;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

	//	성적 등급 계산 프로그램

	//	사용자에게 자바, 파이썬 시험의 점수를 입력받아 등급을 계산하여 출력

	//	등급은 평균으로 계산
	//	등급 구간은 다음과 같다.
	//	90점이상 100점이하 : A등급
	//	80점이상 90점미만 : B등급
	//	70점이상 80점미만 : C등급
	//	60점이상 70점미만 : D등급
	//	60점미만 : F등급
	
		

			Scanner sc = new Scanner (System.in);
			System.out.println("자바의 점수를 입력하시오");
			int java = sc.nextInt();
			System.out.println("파이썬의 점수를 입력하시오");
			int python =sc.nextInt();
			sc.close();
		
	
		double avg = (java + python) / 2.0;
		String grade; 

		if (avg>=90 && avg <=100) {
			grade = "A";
		}else if (avg>=80 && avg <90) {
			grade = "B";
		}else if (avg>=70 && avg <80) {
			grade = "C";
		}else if (avg>=60 && avg <70) {
			grade = "d";
		}else {
			grade = "F";
		}
		
		
		System.out.println(grade+"등급입니다.");
		
		
		
		
		
		
		
		
		
		//계산
		
		
		
		//출력
		
		
		
		
		
		
		
		
		
	}

}
