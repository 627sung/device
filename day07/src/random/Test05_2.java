package random;
import java.lang.*;
import java.util.Random;
public class Test05_2 {

	public static void main(String[] args) {
		//  윷놀이 1턴구현 (4개의 윷을 분리하여 생각)
	//	-안뒤집히면(0), 뒤집힌경우(1)로 가정하고 뒤집힌 개수를 센다

Random r = new Random();
		
		int a = r.nextInt(2);
		int b = r.nextInt(2);
		int c = r.nextInt(2);
		int d = r.nextInt(2);
		
		System.out.println("" + a + b + c + d);  // 문자열처럼 나오게하려고
		System.out.println(a + b + c + d);      //원래 더하는 값
		int total = a + b + c + d;
		
		String yut;
		if(total == 1) {
			if(a == 1) {
				yut = "빽도";
			}
			else{
				yut = "도";
			}
		}
		else if(total == 2) {
			yut = "개";
		}
		else if(total == 3) {
			yut = "걸";
		}
		else if(total == 4) {
			yut = "윷";
		}
		else {
			yut = "모";
		}
		System.out.println("결과 : "+yut);
	}

}
