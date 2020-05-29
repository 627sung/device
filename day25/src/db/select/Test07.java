package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test07 {
	public static void main(String[] args) throws Exception{
//		목표 : study계정의 student 테이블 데이터 개수를 구하시오.
//		구문 : SELECT count(*) FROM student;
//		결과는 무조건 1개가 나온다(그룹 함수이니까)
		
//		준비
//		처리 : Select
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","study", "study");

//		별칭 부여가 가능하다(대상 우측에 별칭을 작성하여 사용 가능)
		String sql = "SELECT count(*) cnt FROM student";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();//select 용 실행명령
		
//		그룹 함수를 실행할 경우에는 일반적인 SELECT와는 다르게
//		데이터가 무조건 1개가 나오므로 while문이 필요하지 않고 바로 이동하여 데이터를 불러온다
//		- count(), min(), max(), sum(), avg() 등
		rs.next();
//		int count = rs.getInt(1);
//		int count = rs.getInt("count(*)");
		int count = rs.getInt("cnt");
		System.out.println(count);
		
		con.close();
		
	}
}



