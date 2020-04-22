package output;
import java. lang.*;
import java.util.Scanner;
public class Test05 {

	public static void main(String[] args) {
		//휘발유가 1L 당은 입력
		//차는 1L에 10.5km를 간다.
		//서울에서 부산갔따가 목포갔다가 오려면 기름은 얼마나 먹나요?
		//서울 - 부산 = 450km  부산 -목표 200km 목포 - 서울은 400km
		System.out.println("1리터당 기름 가격을 입력하시오");

		Scanner sc = new Scanner(System.in);
		int oilPrice = sc.nextInt();
		sc.close();
	    double car = 10.5;  //리터당 자동차 가는 거리
		int stb = 450 ;    //서울 - 부산
		int btm = 200 ;    //부산 -목포
		int mts = 400 ;     //목포 -서울
		
		int totalMove= stb + btm +mts;   //총 이동한거리
        double total = (totalMove/car);    //필요한 기름의 양
        int totalPrice = (int)total*oilPrice; // 가격
        
        System.out.println("예상 기름값은 "+ totalPrice + "원 입니다");
		
		
		
		
		
		
		//출력
	
		
		
		
		
		
		
	}

}
