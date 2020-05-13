package api.lang.object;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		Object a =100;
		Object b= "hello";
		Object c =1.5;
		Object d= true;
		Object e = new int[5];
		Object f  = new Scanner(System.in);
		Object g =new Random();
		
		//b의 자료형은?
		System.out.println(b.getClass()); 
		System.out.println(c.getClass());
		System.out.println(f.getClass());
		
		Double h = 100.5;
		
	}
}
