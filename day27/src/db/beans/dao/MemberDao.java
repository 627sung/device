package db.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.beans.dto.MemberDto;



public class MemberDao {
	
	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");//ojdbc8.jar 등록 확인
		return DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
	}
	
	//회원가입 : 회원이 입력한 정보를 데이터베이스에 추가
	public void regist(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "INSERT INTO member VALUES("
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, '일반', sysdate, null)";
		PreparedStatement ps = con.prepareStatement(sql);
		//9개의 물음표에 데이터를 연결
		ps.setString(1, mdto.getMember_id());
		ps.setString(2, mdto.getMember_pw());
		ps.setString(3, mdto.getMember_nick());
		ps.setString(4, mdto.getPost());
		ps.setString(5, mdto.getBase_addr());
		ps.setString(6, mdto.getExtra_addr());
		ps.setString(7, mdto.getMember_birth());
		ps.setString(8, mdto.getMember_phone());
		ps.setString(9, mdto.getMember_intro());
		ps.execute();//실행
		
		con.close();
//		return;
	}

	//로그인 --사용자가 홈페이지의 회원기능응 이용할 자격이 있는지을 판정 .. 아이디랑 비밀번호 받아서 회원정보 받아서  boolean 값을 받아야 한다. 
	// SELECT * FROM MEMBER WHERE MEMBER_id = ? AND MEMBER_pw?;
	//	 SELECT count(*) FROM MEMBER WHERE MEMBER_id = ? AND MEMBER_pw?;

	public  boolean login(MemberDto mdto)throws Exception{
		Connection con = getConnection();
		
		String sql =  "SELECT count(*) FROM MEMBER WHERE "
				+ "MEMBER_id = ? AND MEMBER_pw=?";
		PreparedStatement ps =con.prepareStatement(sql);
		
		ps.setString(1, mdto.getMember_id());
		ps.setString(2, mdto.getMember_pw());
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		int result =rs.getInt(1);
		con.close();
		
	//	if(result == 1) {
	//		return true;
	//	}else {
	//		return false;
	//	}
		
		return result == 1;
		
		
		
	}
	
	

	public  boolean login2(MemberDto mdto)throws Exception{
		Connection con = getConnection();
		
		String sql =  "SELECT * FROM MEMBER WHERE MEMBER_id = ? AND MEMBER_pw = ?";  
				
		PreparedStatement ps =con.prepareStatement(sql);
		
		ps.setString(1, mdto.getMember_id());
		ps.setString(2, mdto.getMember_pw());
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		boolean result = rs.next();//
		con.close();
		
	//	if(result == 1) {
	//		return true;
	//	}else {
	//		return false;
	//	}
		
		return result;
		
		
	}
	
	
	
	
	// SELECT member_id FROM MEMBER WHERE MEMBER_nick ='테스트맨' AND  member_birth = '1999-12-31';
	
	public String findId(MemberDto mdto)throws Exception{
		Connection con = getConnection();
		
		String sql =  "SELECT member_id FROM MEMBER WHERE MEMBER_nick = ? AND  member_birth = ?";  
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,mdto.getMember_nick());
		ps.setString(2,mdto.getMember_birth());
		ResultSet rs = ps.executeQuery();
		
		String id;
		
	
		if(rs.next()) {
			id = rs.getString("member_id");
		}else {
			id = null;
			con.close();
			
		}
		return id;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//아이디 찾기
	
}
