package oop.method4;

public class score {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	//세팅 
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
	
	//합구하기 메소드
	void doSum() {
		sum=this.kor+this.eng+this.math;
	}
	
	//평균구하기 메소드
	void doAvg(){
		avg=sum/3; 
	}
	
	//출력메소드
	void output() {
		System.out.println(this.name +"의 합"+sum);
		System.out.println(this.name +"의 평균"+avg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
