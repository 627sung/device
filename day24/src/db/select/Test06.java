package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test06 {
	public static void main(String[] args) throws Exception{
//		목표 : 아이디에 'd'가 들어간 회원을 조회하여 출력(아이디, 권한)
//		문제점 : 평생 아이디에 'd'가 들어간 회원만 조회한다(이걸 어따 쓰냐~)
		
//		준비 : 없음
//		처리 : Select 구문 수행
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		명령 실행
		String sql = "SELECT * FROM client WHERE client_id LIKE '%d%' ORDER BY client_id ASC";
		PreparedStatement ps = con.prepareStatement(sql);
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







