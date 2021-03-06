package db.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) throws Exception{
//		목표 : Student 테이블 데이터의 정보를 수정하는 것
//		- 이름과 점수를 수정할 수 있다(번호는 절대로 수정하면 안된다... 기본키니까)
//		- 특별한 경우가 아니라면 기본키를 이용하여 한개씩만 수정하는 것이 원칙이다(삭제도 마찬가지)
		
//		준비 : 수정할 데이터 + 기본키
		int student_no = 2;
		String student_name = "통키";
		int student_score = 71;
		
//		처리 : 직접 작성 or DAO 를 이용
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		2번 학생의 이름을 '통키', 점수를 71점으로 수정
//		UPDATE student SET student_name='통키', student_score=71 WHERE student_no=2;
		String sql = "UPDATE student "
						+ "SET student_name=?, student_score=? "
						+ "WHERE student_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, student_name);
		ps.setInt(2, student_score);
		ps.setInt(3, student_no);
		
//		실행 명령이 뭘까?
//		INSERT - 추가 된것만 확인하면 되므로 ps.execute()
//		SELECT - 결과 집합을 얻어내야 하므로 ps.executeQuery()
//		UPDATE, DELETE 
//		- 변경(적용) 결과 개수를 알아내야 하므로 ps.executeUpdate()를 사용
//		- 결과 알아낼 필요 없으면 ps.execute()를 써도 무방
		
//		ps.execute();
		int result = ps.executeUpdate();
		System.out.println("result = " + result);
		
		con.close();
		
		if(result == 0) {
			System.out.println("대상이 없습니다");
		}
		else {
			System.out.println("수정 완료!");
		}
		
	}
}






