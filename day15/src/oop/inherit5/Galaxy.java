package oop.inherit5;

public class Galaxy extends Phone {

	//출력메소드르 만든다...
	public void output() {
		System.out.println("번호:"+number);
	}
	 
	//상속받은 메소드가 마음에 안들면 하나 더 만든다 ..
	//단 똑같은 형태로 만들어야한다.
	// 메소드 오버라이드... 세ㅐ
	
public void info() {
	 System.out.println("이 제품은 삼성에서 만들었읍니다.");
}
	
}
