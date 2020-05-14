package oop.inherit.abstract1;
//추상클래스 
//상속관계에서 상위 역할을 수행하는 클래스 
//추상메소드를 가진다..  객체생성이 불가능하다. 
//추상클래스는 객체의 생성이 불가능하다 ..... 
//반드시 상위 클래스에서만 쓴다 .
public abstract class Phone {
 protected String number;
 
 //추상메소드는 형태만 있고 내용이 없다 ....  
 //메소드의 형태만 만들고 내용을 안쓴다...... . 있긴있어야 하는데 잘 모를떄
 
 public  abstract void call();
 public  abstract void sms();
 public  abstract void internet();

	
	
	
	

}
