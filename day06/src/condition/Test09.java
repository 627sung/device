package condition;
import java.lang.*;
import java.util.Scanner;
public class Test09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("진입시간");		
		int inHour = sc.nextInt();
		System.out.println("진입시간(분)");		
		int inMinute = sc.nextInt();
		
		System.out.println("진출시간");
		int outHour = sc.nextInt();
		System.out.println("진출시간(분)");
		int outMin = sc.nextInt();
		sc.close();

		int outTime = (outHour*60+outMin);
		int inTime = (inHour*60+inMinute);
		int PakingTime = outTime-inTime;
		//총사용시간			
System.out.println();
		int price= 10000;								
		 if(PakingTime>=121) { 
			 price =  price;
		 } else if(PakingTime>=111) { 
			 price -= 1000;
		 } else if(PakingTime>=101) { 
			 price -= 2000;
		 }else if(PakingTime>=91) { 
			 price -= 3000;
		 }else if(PakingTime>=81) { 
			 price -= 4000;
		 }else if(PakingTime>=71) { 
			 price -= 5000;
		 }else if(PakingTime>=61) { 
			 price -= 6000;
		 }else if(PakingTime>=51) { 
			 price -= 7000;
		 }else if(PakingTime>=41) { 
			 price -= 8000;
		 }else if(PakingTime>=31) { 
			 price-= 9000;
		 }else {
			 price = 0;
		 }
System.out.println( price);
		
//		사용시간(진출시간-진입시간)<=30 라면 주차요금=0
//		그렇지않고 사용시간이 31분이상이라면 10분마다 1000원씩
	

	
	}
}
	
	
