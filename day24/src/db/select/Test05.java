package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		목표 : product 계정에 있는 product 테이블의 모든 데이터를 정렬하여 출력
		
//		준비 : X(만약에 있다면 정렬할 항목과 방식)
//		처리 : Database에서 Select처리
//			- 실행 명령이 ps.execute()가 아니고 ps.executeQuery() : ResultSet을 얻어내기 위하여
//			- ResultSet을 이용하여 데이터를 출력하는데 연결이 종료되기 전에 해야 한다
		
		Class.forName("oracle.jdbc.OracleDriver");//ojdbc?.jar 필요
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "product", "product");
		
//		명령 준비 및 실행
		String sql = "SELECT * FROM product ORDER BY price DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();//rs : 결과집합 표
		
		while(rs.next()) {
			System.out.println("데이터 한 줄 발견!");
			int no = rs.getInt("no");
			System.out.println(no);
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("type"));
			System.out.println(rs.getInt("price"));
			System.out.println(rs.getString("made"));
			System.out.println(rs.getString("expire"));
		}
		
		con.close();
//		결과 : 연결 종료 전에 보여줘하기 때문에 따로 빼서 출력할 수 없다.(처리에 포함)
		
	}
}





