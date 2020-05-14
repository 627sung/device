package api.lang.String;

import java.util.Scanner;

public class Test02_2 {
	public static void main(String[] args) {
//		데이터 준비
		User a = new User("master", "master1234");
		User b = new User("tester", "test1234");
		User c = new User("admin", "admin1234");
		
//		사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디, 비밀번호를 입력");
		String id = sc.next();
		String pw = sc.next();
		sc.close();
		
		System.out.println("id = " + id + " , pw = " + pw);
		
		if(
				(id.equalsIgnoreCase(a.getId()) && pw.equals(a.getPassword()))
				|| (id.equalsIgnoreCase(b.getId()) && pw.equals(b.getPassword()))
				|| (id.equalsIgnoreCase(c.getId()) && pw.equals(c.getPassword()))
				) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}
