package Loop;
import java.lang.*;
public class Test03 {

	public static void main(String[] args) {
		// 영원한 반복이 불가능하게 제동을 걸어보자 
		// 횟수로제한하는 방법(제한)
		// 시점으로는 제한 (언제까지)
		
		int n = 0 ;   // 반복수는 전에 만들어져야한다 .무적권 뭔가 하나 들어 있어야 합니다.
		while (n<20) {//실행조건을 적습니다.  
		System.out.println("Hello " + n);  //내가 반복하고싶은것 먼저 
		n++;//n+=1;  // n = n+1;    // 하고 싶은거  다하고 더한다 끝으로 위치 고정 
		}
		
	
	}

}
