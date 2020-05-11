package oop.inherit5;
//공통부분만 정의하고 생성은 안하는게 좋다 ... (애매하다)
public class Phone {
	protected String number;//같은 패키지, 자식클래스 사용가능..
	//상위 클래스를 만들때는 접근제한을 고려해봐야한다. 
 //private :모두 차단하고 싶을때;
// protected : 상속받는 클래스들에게 허용하고 싶을때; 
	
	
	 	public void info() {
	 		System.out.println("이 휴대폰은 제조사는 xxx입니다.");
	 	}
	 	
	
}
