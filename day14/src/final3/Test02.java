package final3;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		//가위바위보
		//가위(0) 바위(1) 보 (2 )
		
		Random r = new Random();
		int rsp = r.nextInt(3);
		
		switch(rsp) {
		case RSP.SCISSORS:
			System.out.println("가위");
			break;
		case RSP.ROCK:
			System.out.println("바위");
			break;
		case RSP.PAPER:
			System.out.println("보");
			break;
		}
			
			
			
}
}