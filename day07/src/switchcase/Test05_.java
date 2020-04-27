package switchcase;

import java.util.Random;

public class Test05_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r = new Random() ;		
		int n =r.nextInt(1000)+1;  //1~1000까지 랜덤뽑기
		String check;
		
		switch(n) {
		case  1:
			check = "최고급세단"; break; 
		case  2: 		case  3: 		case  4:
			check = "최고급세단"; break; 
		case  5: 	case  6: case    7: case     8: case  9: case  10:
		case  11:  case  12: case  13: case  14: case  15:

			check = "태블릿"; break; 
		default:
			check = "꽝 "; break; 
		}
		
		
	
		System.out.println(check);
		
		
		
		
	}

}
