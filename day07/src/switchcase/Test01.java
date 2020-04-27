package switchcase;
import java.lang.*;
import java.util.Random;
public class Test01 {

	public static void main(String[] args) {
		// switch를 이용한 가위바위보
		//가위  0 바위 1 보2 -   =  0 1 2             
		
		Random r = new Random();
		int rsp = r.nextInt(3);
		System.out.println("rsp ="+rsp);

		switch(rsp) {
		case 0: 
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		default:
			System.out.println("보");
			break;
		}
		
	
	} 
	
	
	

}
