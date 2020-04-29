package array;
import java.lang.*;
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//정수 배열
		int [] num = new int[3];
		num[0] = 10 ;
		num[1] = 20 ;
		num[2]  =30 ;
		
		//사과 배열 
		String [] f = new String [3];
		f[0] = "사과";
		f[1] = "딸기";
		f[2] = "바나나";
		//소수 배열
		float[] d = new float[3];
		d[0] = 1.2f;
		d[1] = 2.3f;
		d[2] = 3.4f;
		
		System.out.println("정수 출력");
		for(int i =0; i<3; i++) {   //숫자출력
			System.out.println(num[i]);
			}
		System.out.println("과일 출력");

		for(int i =0; i<3; i++) {  //딸기 출력
			System.out.println(f[i]);
			}
		System.out.println("소수출력");
		for(int i =0; i<3; i++) { //소수 출력 
			System.out.println (d[i]);
			}
		
		
		
		
		
		
		
		
	}

}
