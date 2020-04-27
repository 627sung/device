package switchcase;
import java.lang.*;
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		//사용자에게 닉네임을 입력받고 입력받은 닉네임이 "운영자"인지 검사;
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 닉네임을 입력하시오");
		String nick = sc.next();
		sc.close();
	
		switch(nick) {
		case "운영자":
				System.out.println("운영자는 사용할수 없는 닉네임");
			break;
			default:
			System.out.println("사용할수 있는 닉네임입니다.");
			break;
		}
		
		
		
		
		
	}

}
