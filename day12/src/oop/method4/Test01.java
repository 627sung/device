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

		//합계 구하기
		a1.doSum();
		a2.doSum();
		a3.doSum();
		//평균구하기
		a1.doAvg();
		a2.doAvg();
		a3.doAvg();

		//출력하기
		a1.output();
		a2.output();
		a3.output();
		
		
	}

}
