package oop.method4;


public class Test01 {

	public static void main(String[] args) {
		
		score a1=new score();
		score a2=new score();
		score a3=new score();

		//정보설정
		a1.setting("통키",80,85,82);
		a2.setting("슛돌이",55,90,85 );
		a3.setting("피카츄",77,65,23);

		//점수를 수정 
		a1.kor =22;
		
		

		//출력하기
		a1.output();
		a2.output();
		a3.output();
		
		
	}

}
