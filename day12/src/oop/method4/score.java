package oop.method4;

public class score {
	//멤바 필드(변수)데이터 저장 
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	//멤버 메소드 -코드저장
	void setting(String name, int kor ) {
		this.setting(name, kor,0,0);
	
	}
	void setting(String name, int kor, int eng) {
		this.setting(name, kor, eng,0);
	}
	
	void setting(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng =eng;
		this.math=math;
	
	}
	

	
	//출력메소드
	void output() {
		int total=this.kor+this.eng+this.math; //지역변수사용 :메소드 실행시에만 잠시 사용할 변수 
		double avg=total/3.0;
		
		
		System.out.println("[학생정보]");
		System.out.println("이름"+this.name);
		System.out.println("총점"+total); //output이라는 메소드안에서만 사용  
		System.out.println("평균"+avg); // output이라는 메소드안에서만 사용 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
