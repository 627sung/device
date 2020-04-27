package switchcase;
import java.util.Random;
import java.util.Scanner;
public class Test04_ {

	public static void main(String[] args) {
		Random r= new Random();
		//중복 코드 없이 짜기 /
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력바랍니다.");
		int year = sc.nextInt();
		boolean isLeaf=(year % 400 == 0) ||  (year % 100 != 0 &&  year % 4 == 0);

		//해당연도의 랜덤한 날짜 
		
		//계산을 통해 랜덤한 월 일 2개를 구한다. 
		 // -일은 월을 알아야 구한다. 
		// - 월은 1부터 12사이를 구해야한다. 
		//월을 구하고 일을 구한다. 
		//경우:
		// 31 일 1 35 7 8 10 12
		//30일 4 6 9 11 
		//28 2월 윤년있다.
		//29 2월 윤년없다 
		int month = 4;
		int max = 30;   // 28 or 29 or 30 or 31 
		int  date = r.nextInt(max)+1;   //1~28 29 30 31 ;
		
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			max =31; break;
		case 4: case 6: case 9: case 11:
			max =30; break;
			default:
			  if(isLeaf) {
				  max = 29;
			  }
			  else {
				  max = 28;
			  }
		
		}
		
		
		System.out.println(month+"월"+max+"일");

	}

}
