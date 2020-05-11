package oop.final2;

public class Member {
	 private final String id; // 한번 정해지면 바꿀수 없다 .   ... 생성자를 맞춰준다 ..  파이널이 있다면 어떤식으로드 초기화를 시켜주어야한다. 아이디는 한번만 만들면끝 새터 메소드 필요없어 
	 private String pw;

	 
	 //final 항목은 생성자에서 반드시 초기화가 가능해야한다. 
	 public Member(String id ) {  
		 this.id =id;
   	 }
	 public Member(String id , String pw) {
		 this.id =id;
		 this.pw=pw;
   	 }
	 
	  	public String getId() {
			return id;
		}
	  	
	  	public void setPw(String pw) {
			this.pw = pw;
		}
	  	public String getPw() {
			return pw;
		}
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
