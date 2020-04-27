package switchcase;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//사용자에게 월을 입력받아 해당하는 월의 날자수를 출력 
//		1   31
//		2   28 
//		3 31
//		4 30
//		5 31
//		6 30
//		7 31 
//		8  31
//		9  30
//		10  31 
//		11 30 
//		12 31 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("알고싶은 달을 입력하세요 ");

		int month = sc.nextInt();
		 sc.close(); 
		switch(month) {
		case 1:
			System.out.println(month +"월은 31일까지 있어요");
		break;
		case 2:
			System.out.println(month +"월은 28일까지 있어요");
		break; 
		case 3:
			System.out.println(month +"월은 31일까지 있어요");
		break; 
		case 4:
			System.out.println(month +"월은 30일까지 있어요");
		break;
		case 5:
			System.out.println(month +"월은 31일까지 있어요");
		break;
		case 6:
			System.out.println(month +"월은 30일까지 있어요");
		break;
		case 7:
			System.out.println(month +"월은 31일까지 있어요");
		break;
		case 8:
			System.out.println(month +"월은 31일까지 있어요");
		break;
		case 9:
			System.out.println(month +"월은 30일까지 있어요");
		break;
		case 10:
			System.out.println(month +"월은 31일까지 있어요");
		break;
		case 11:
			System.out.println(month +"월은 30일까지 있어요");
		break;
		default:
			System.out.println(month +"월은 31일까지 있어요");
		break;
		}
		
		
		
		
		
		
		
		
		
	}

}
