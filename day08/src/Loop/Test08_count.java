package Loop;
import java.util.Random;
public class Test08_count {

	public static void main(String[] args) {
		//개수세는 방법
		 // -합계 구하는 방법과 크게 다르지 않다 .
		// 예제 : 주사위를 30번 던졌을때 1이 나오는 횟수를 측정 
		Random r = new Random();
		
		
		
		
		int n = 0;
		int count =0;
		while(n<30) {
			int dice = r.nextInt(6)+1;
			System.out.println("주사위 :"+dice);
			if(dice == 1){
			count ++;  //원하는 코드가 끝난뒤에
			}
			
			n++;
		}
	 System.out.println(count);
	}

}
