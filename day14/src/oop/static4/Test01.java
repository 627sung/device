package oop.static4;

public class Test01 {

	public static void main(String[] args) {
       
		int a = Calculator.square(11);
		double b= Calculator.circle(5);
		int c = 	Calculator.dice();
		int d =Calculator.random(1, 45);

		
		System.out.println("제곱 "+a);
		System.out.println("원의넓이 "+b);
		System.out.println("주사위 "+c);
		System.out.println(d);
		
		
		
		
		
	}

}
