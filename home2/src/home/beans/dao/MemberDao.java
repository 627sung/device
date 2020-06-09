package home.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import home.beans.dto.MemberDto;

public class MemberDao {

	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
	}
	
	//가입 메소드
	public void join(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, '일반', sysdate, null)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, mdto.getMember_id());
		ps.setString(2, mdto.getMember_pw());
		ps.setString(3, mdto.getMember_nick());
		ps.setString(4, mdto.getPost());
		ps.setString(5, mdto.getBase_addr());
		ps.setString(6, mdto.getExtra_addr());
		ps.setString(7, mdto.getMember_birth());
		ps.setString(8, mdto.getMember_phone());
		ps.setString(9, mdto.getMember_intro());
		
		ps.execute();
		
		con.close();
	}
	
}