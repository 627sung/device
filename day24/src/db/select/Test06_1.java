package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) throws Exception{
//		목표 : 아이디에 사용자가 입력한 검색어가 들어간 회원을 조회하여 출력(아이디, 권한)
		
//		준비 : 검색어
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어 입력");
		String keyword = sc.nextLine();
		sc.close();
		
//		처리 : Select 구문 수행
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		명령 실행
//		String sql = "SELECT * FROM client WHERE client_id LIKE '%"+keyword+"%' ORDER BY client_id ASC";
		String sql = "SELECT * FROM client WHERE client_id LIKE ? ORDER BY client_id ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%" + keyword + "%");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("데이터 발견!");
			String id = rs.getString("client_id");
			String auth = rs.getString("client_auth");
			System.out.println("아이디 : "+id+", 권한 : "+auth);
		}
		
		con.close();
//		결과 : 처리에서 같이 출력
	}
}







