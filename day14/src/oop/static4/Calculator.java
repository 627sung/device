package oop.static4;

import java.util.Random;

public class Calculator {

	Random r= new Random();

	//static
	public static int square(int a) {
		return a*a;
	}
	
	public static double circle(int r) {
		return square(r)*3.14;
	}
	
	
	
	public static int dice(){
		Random r= new Random();
		return  r.nextInt(6)+1 ;
	}


	
	public static int random(int start, int finish) {
		//?부터 ?개인지 파악해야함
		//시작 : start
		//개수 : finish - start +1;
		Random r= new Random();

		return r.nextInt(finish-start+1)+start;
	
	}
	
	
	
	
	
	
	
	
}





