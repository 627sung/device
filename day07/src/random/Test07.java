package random;
import java.lang.*;
import java.util.Random;
public class Test07 {

	public static void main(String[] args) {
		
		//랜덤카드뽑기 단 조커 x         카드는 52개입니다. 
		//-모양 하트 다이아 클로버 스페이드 
		//-숫자 A, 2 3 4 5 6 7 8 9 10 j q k 
		//실행시 하트 a 나오게
		
		//들어오는값.
		
		//모양계산
		Random r = new Random();
			

		int shape =r.nextInt(4) ;
		String sh;
		
		if (shape == 0) {
			sh = "다이아";
		} else if (shape == 1) {
			sh = "하트";
		} else if (shape == 2) {
			sh = "클로버";
		} else  {
			sh = "스페이드";
		}

		
		//-숫자 A, 2 3 4 5 6 7 8 9 10 j q k 
		
		int b = r.nextInt(13)+1;
		String num; 
		
		
		if (b == 1) {
		num = "A"; 	
		} else if (b==11) {
			num = "j";
		}else if (b==12) {
			num = "q"; 
		}else if( b == 13){
			num = "k";
		}else { 
			num = ""+b;  // ""붙여서 문자열로 바꾸는 꼼수 
		}

		System.out.println(sh +" "+ b);
		
							
		
	}

}
