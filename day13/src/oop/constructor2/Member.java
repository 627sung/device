package oop.constructor2;

public class Member {
	//멤버 필드 .데이터를 저장 
	String id;
	String password;
	String authority;
	int point;
	
	//생성자
	
	Member(String id,String password){
		this(id,password,"일반",100);//생성자끼리만가능
	}
	 
	//모든조건
	Member(String id,String password,String authority,int point){
		this.id = id;
		this.password=password;
		this.authority=authority;
		if(point>=0) {
		this.point=point;
		}
	}
	
	
	void output() {
	System.out.print(this.id+"\t");	
	System.out.print(this.password+"\t");
	System.out.print(this.authority+"\t");
	System.out.println(this.point);
	}
	
	
	
	
}
