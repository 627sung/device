package oop.constructor1;

public class Student {
	//멤버변수(필드)=인스턴스변수
	String name;
	int score;
	
	//생성자;;
	// - 이 클래스의 생성방법을 정의하는 구문]
	// 생성자는 메소드의 특수화 형태 
	//객체 생성시 1회만 호출
	// 객체의 데이터 생성시 초기화 하는 역할 수행 
	//생성자도 오버로딩이 가능하다. 이름은 클래스와 같아야 한다. 
	
	Student(String name,int score) { //매개변수
		this.name=name;
		this.score=score;
	}
	
	
	
	void output() {
	System.out.println(/*this.*/name);	
	System.out.println(/*this.*/score);
	}
	
	
	
	
	
}
