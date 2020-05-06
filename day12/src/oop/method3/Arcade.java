package oop.method3;

public class Arcade {

	String name;
	int price ;
	int income;
	

	
		
	
	void setting(String name,  int price) {//income은 받을 필요가 없지..
		//this.name =name;
		//this.price=price;
		//this.income=0; //오락기를 처음사서 설치하면 수익은 0원 
		this.setting(name,price,0);
	}
	
	void setting(String name,  int price,int income) {//income은 받을 필요가 없지..
		this.name =name;
		this.price=price;
		this.income =income;
		//this.income=0; //오락기를 처음사서 설치하면 수익은 0원 
	}
	
	
	
	
	
	
	
	/*
	 * 메소드 오버로딩 (method overloading);
	 *   같은 이름의 메소드를 여러개 만드는 것 
	 *   다양한 경우를 가정하여 이용
	 *  방법에 차이를 두로록 구성 /
	 *  아무때나 되는것은 아니고 -이름은 같아야한다.
	 *   - 매개 변수가 달라야한다. 
	 *   1.개수가 다르거나
	 *  2 .자료형이 다르거나;
	 *    3.순서가 다르거나 
	 * 
	 */
	void play() {
		//this.income+=this.price;
		this.play(1);
	}
	

	
	void play(int pan) {
	 this.income+=this.price*pan;
	}
	
	
	
	void output() {
		System.out.println("오락기정보");
		System.out.println("이름  "+this.name);
		System.out.println("가격  "+this.price+"원");
		System.out.println("누적수입  "+this.income+"원");
		System.out.println("");

	}
	
	
	
}
	
	

