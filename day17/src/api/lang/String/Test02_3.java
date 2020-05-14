package api.lang.String;

import java.util.Scanner;

public class Test02_3 {
	public static void main(String[] args) {
//		데이터 준비
		User[] data = new User[3];
		data[0] = new User("master", "master1234");
		data[1] = new User("tester", "test1234");
		data[2] = new User("admin", "admin1234");
		
//		사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디, 비밀번호를 입력");
		String id = sc.next();
		String pw = sc.next();
		sc.close();
		
		System.out.println("id = " + id + " , pw = " + pw);

		int count = 0;
		for(int i=0; i < data.length; i++) {
			if(id.equalsIgnoreCase(data[i].getId()) && pw.equals(data[i].getPassword())) {
				count++;
				break;
			}
		}
		
		System.out.println("count = " + count);
		
		if(count == 1) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}





