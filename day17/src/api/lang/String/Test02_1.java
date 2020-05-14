package api.lang.String;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디, 비밀번호를 입력");
		String id = sc.next();
		String pw = sc.next();
		sc.close();
		
		System.out.println("id = " + id + " , pw = " + pw);
		
		if(
				(id.equalsIgnoreCase("admin") && pw.equals("admin1234"))
				|| (id.equalsIgnoreCase("tester") && pw.equals("test1234"))
				|| (id.equalsIgnoreCase("master") && pw.equals("master1234"))
				) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}
