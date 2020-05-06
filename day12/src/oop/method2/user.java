package oop.method2;

public class user {

	String nickname;
	String job;
	int level;
	int money;
	
	void output() {
		System.out.print(this.nickname+"\t");
		System.out.print(this.job+"\t");
		System.out.print(this.level+"\t");
		System.out.println(this.money+"\t");
	}
		
	void setting(String nickname, String job,int level, int money) {
		this.nickname =nickname;
		this.job=job;
		this.level=level;
		this.money=money;
	}
}

