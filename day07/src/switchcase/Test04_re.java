package switchcase;

import java.util.Random;
import java.util.Scanner;

public class Test04_re {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 0000형식 입력 ");
		//만들어야 할것. 랜덤으로 숫자를 뽑는 것 12자리.. 
		int year = sc.nextInt();
		sc.close();
		//각각의 달의 정보 몇월은 몇일까지 등등 

	    int month = r.nextInt(12)+1;
	    boolean is400 = year % 400 == 0; 
		boolean isNot100 = year % 100 != 0;
		boolean is4 = year % 4 == 0;
		boolean isLeapYear = is400 || isNot100 && is4;
		
		int day;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=r.nextInt(31)+1;
			break;
		case 4 : case 6 : case 9 : case 11:
			day=r.nextInt(30)+1;
			break;
		default:
			day=r.nextInt(30)+1;
			  if(isLeapYear) {
					day=r.nextInt(29)+1;
			  } else {
					day=r.nextInt(28)+1;
					}
			  }
		System.out.println(month +"월" +day+"일");
		
		}
			
	}


