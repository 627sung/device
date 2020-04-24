package random;
import java.lang.*;
import java.util.Random;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//동전 던지기 동전이 나온다 앞 아니면 뒤 /// 랜덤 뽑아서 1이면 앞 2이면 뒤 
		
		Random r =new Random ();
		 int coin = r.nextInt(2);    //0부터  1		
		if (coin ==0) {
			System.out.println("앞면");
		}else {
			System.out.println("뒷면");
		}
		
		String rcpp;
		int rcp = r.nextInt(3);
		if(rcp==0) {
			rcpp="가위";
		 }else if(rcp==1) {
			 rcpp="바위";
		 } else {
			 rcpp="보";
		 }
		 System.out.println("가위 바위 보  =>"+rcpp);
		
		
		 //윷놀이 
		 int board = r.nextInt(15);  
		 System.out.println(board);
		 
		 
		 
		 String re;
		 
		 
		if (board == 15) {
			re = "빽도";
		} else if (board == 14) {
			re = "모";
		} else if (board == 13) {
			re = "윷";
		} else if (board >= 10 && board <= 12) {
			re = "도";
		} else if (board >= 6 && board <= 9) {
			re = "걸";
		} else {
			re = "개";
		}
			
		 
		 
		 System.out.println("윷던진결과 = "+re);
		 
		
		
		
		
		
		
		
		
		
		
	}

}
