package final3;

import java.util.Random;

public class Test01 {
	
	static final int SCISSORS=0;
	static final int ROCK=1;
	static final int PAPER = 2;
	
	
	
	
	
	
	public static void main(String[] args) {
		//가위바위보
		//가위(0) 바위(1) 보 (2 )
		
		Random r = new Random();
		int rsp = r.nextInt(3);
		
		switch(rsp) {
		case SCISSORS:
			System.out.println("가위");
			break;
		case ROCK:
			System.out.println("바위");
			break;
		case PAPER:
			System.out.println("보");
			break;
		}
			
			
			
}
}
