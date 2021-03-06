package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		목표 : select 명령을 실행하여 데이터베이스 student에 저장된 내용을 불러와 출력
		
//		준비할 데이터는 없음
		
//		처리
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		조회 구문을 작성하여 실행
		String sql = "select * from student";
		PreparedStatement ps = con.prepareStatement(sql);
		
//		ps.execute();//실행구문 : 결과를 확인할 수 없으므로 잘못된 실행방법이다.(insert 용)
		ResultSet rs = ps.executeQuery();//실행 후 결과 집합을 가져오는 실행명령(select 용)
		
//		ResultSet은 데이터베이스를 조회한 "결과집합(표)"이다.
//		Q) rs에는 데이터가 몇 개 있을까요? 알 수 없음(즉, rs에는 데이터 개수를 확인하는 명령이 없다)
//		- rs.next()가 false가 나오면 더이상 데이터 읽을 것이 없다는 뜻이므로 반복을 중지한다!
		
		while(true) {
//			System.out.println(rs.next());//다음 줄로 이동(데이터가 있을 수도, 없을 수도 있는데 결과를 출력해보자)
			if(rs.next() == false) break;
			System.out.println(rs.getInt("student_no"));//"student_no" 칸에 있는 데이터를 int 형태로 꺼내라
			System.out.println(rs.getString("student_name"));//"student_name" 칸에 있는 데이터를 String 형태로 꺼내라
			System.out.println(rs.getInt("student_score"));//"student_score" 칸에 있는 데이터를 int 형태로 꺼내라
			System.out.println(rs.getString("student_create"));//"student_create" 칸에 있는 데이터를 String 형태로 꺼내라(날짜는 문자열 취급)
		}
		
		con.close();
		System.out.println("성공!");
	}
}











