package output;
import java. lang.*;
import java.util.Scanner;

public class Test05_t {

	public static void main(String[] args) {
		//1050km를 여행하기 위한 필요한 기름 계산
		
		int distance = 1050;  //여행거리
		double effect = 10.5;  //연비
		double liter  = distance / effect; // 1 
		
		System.out.println("여행에 필요한 기름은"  + liter + "L입니다");
		System.out.println(liter);
		
		//2.휘발유 가격을 입력받아 여행경비를 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.println("휘발유 가격을 입력하시오");
		
		int price = sc.nextInt();
		sc.close();
		int total = (int) (liter *  price);
		
		
		
		
		System.out.println("필요 예상 경비는 " + total + "입니다");
		
		
		
		
		
		
	}

}
