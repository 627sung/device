package study.beans.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	// 연결 메소드
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		return con;
	}

	// 등록 메소드
	public void regist(StudentDto sdto) throws Exception {
		Connection con = getConnection();

		String sql = "INSERT INTO student VALUES(" + "student_seq.nextval, ?, ?, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sdto.getStudent_name());
		ps.setInt(2, sdto.getStudent_score());

		ps.execute();

		con.close();
	}

	public List<StudentDto> getList() throws Exception {

		Connection con = getConnection();

		String sql = "SELECT * FROM student ORDER BY student_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(); // 실행

		List<StudentDto> list = new ArrayList<>(); // 비어있는 LIst준비
		while (rs.next()) {
			StudentDto sdto = new StudentDto();
			sdto.setStudent_no(rs.getInt("student_no"));
			sdto.setStudent_name(rs.getString("student_name"));
			sdto.setStudent_score(rs.getInt("student_score"));
			sdto.setStudent_create(rs.getString("student_create"));

			list.add(sdto);
		}
		con.close();
		return list;
	}

}
