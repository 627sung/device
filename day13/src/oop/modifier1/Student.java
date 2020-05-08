package oop.modifier1;

public class Student {
	
	//	private=잠금
	private String name;
	private	int score;
	
	
	//Student()[]//기본생성자. 숨겨져있다. 
	
	
	//우회 접근하도록 메소드 구축 .....
	//-이름설정 메소드 (setter)
	//-점수설정 메소드 (setter)

	public void setName(String name) {
		if(name.length()>=2) {
		this.name=name;
		}
	}
	
	public void setScore(int score) {
		if(0<=score && score<=100){
			this.score =score;
			}
		}
	
	//
	
	//외부에서 데이터를 가져할수 있도록 하는 메소드 
	// getter method
	//이름을 반환하는 메소드
	// 점수를 반환하는 메소드
		public String getName() { //반환형 
			return this.name; // 이름을 가져가시오 
		}
		public int getScore() {
			return this .score;
		}
	
	
	
	
	

	
}//class 닫는다.
