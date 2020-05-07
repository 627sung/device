package oop.objectarray;

import java.util.Random;

//주사위 한세트
public class DiceSet {
	//필드
	int first,second;
	
	
	
	
	//옵션1: 랜덤생성하는 방법 
	DiceSet()	{ //기본생성자 :매개변수가 1개도 없는 생성자 
		Random r = new Random();
		this.first = r.nextInt(6)+1;
		this.second = r.nextInt(6)+1;
		}
	
	
	//옵션 2 값을 집어넣어서 생성하는 방법  =>조작 가능 
	
	DiceSet(int first,int second){
		this.first =first;
		this.second =second;
	}
	

	
	
	//메소드

	void output(){
		System.out.println("첫번쨰 "+this.first+"  두번째 "+this.second);
	}
	
	
	
	
	
}
