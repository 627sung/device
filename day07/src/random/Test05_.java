package random;

import java.util.Random;

public class Test05_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 윷놀이 1턴 구현(1/6) 
		// 빽도(0)  도(1~3)  개(4~9)  걸(10~13)  윷(14) 모(15)  > 확률은 고려x
	
		Random r = new Random();
		int n =r.nextInt(15);
		
	System.out.println("n="+n);
		String yut;
	if (n ==0) {
		yut = "빽도";
	}else if (n<4) {
		yut = "도";
	}else if (n <10 ) {
		yut = "개";
	}else if(n <14) {
		yut = "걸";
	}else if (n == 14 ) {
		yut = "윷";
	}else  {
		yut = "모";
	}
	System.out.println(yut);
	
	}

}
