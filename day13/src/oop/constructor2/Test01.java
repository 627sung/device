package oop.constructor2;

public class Test01 {

	public static void main(String[] args) {

		
		Member m1=new Member("tester","test1234");
		Member m2=new Member("admin","admin1234","운영자",9999);
		Member m3=new Member("user","user1234");

		
		
		
		
		m1.output();
		m2.output();
		m3.output();

		
	}

}
