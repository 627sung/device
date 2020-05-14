package api.lang.String;

import java.util.Scanner;
public class Test02_4 {
	public static void main(String[] args) {
//		사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디, 비밀번호를 입력");
		String id = sc.next();
		String pw = sc.next();
		sc.close();
		
		LoginManager manager = new LoginManager();
		if(manager.login(id, pw)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}








