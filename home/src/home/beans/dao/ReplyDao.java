package home.beans.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import home.beans.dto.BoardDto;
import home.beans.dto.ReplyDto;

public class ReplyDao {

	//context.xml에서 관리하는 자원 객체를 사용할수 있또록 연결 코드 구현 
	 private static DataSource src; //리몬컨 선언 
	 //static 변수의 초기화가 복잡할 
	 static {
		// src =context.xml 관리하는 자원의 정보;
		 try {
			Context ctx =new InitialContext();//탐색도구
			Context env =(Context) ctx.lookup("java:/comp/env");
			src = (DataSource) env.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}  
	 }
	
	
	//연결 메소드
	public Connection getConnection() throws Exception {
	//	Class.forName("oracle.jdbc.OracleDriver");
	//	return DriverManager.getConnection(
	//			"jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
		
		return src.getConnection();
	}

	public List<ReplyDto> getList() throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM reply ORDER BY reply_no DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<ReplyDto> list = new ArrayList<>();
		while(rs.next()) {
			ReplyDto rdto  = new ReplyDto(rs);
		
			list.add(rdto);
		}
		
		con.close();
		return list;
	}
	
	
		
	public List<ReplyDto> getList(int board_no) throws Exception{
		Connection con = getConnection();
		
		String sql = "	SELECT * FROM reply WHERE REPLY_origin =? ORDER BY reply_no asc";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, board_no);

		ResultSet rs = ps.executeQuery();
		
		List<ReplyDto> list = new ArrayList<>();
		while(rs.next()) {
			ReplyDto rdto  = new ReplyDto(rs);
		
			list.add(rdto);
		}
		
		con.close();
		return list;
	}

	public void write(ReplyDto rdto)  throws Exception{

		Connection con = getConnection();
		String sql = 
				"INSERT INTO reply VALUES( reply_seq.nextval, ? , ? ,sysdate, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, rdto.getReply_writer());
		ps.setString(2, rdto.getReply_content());
		ps.setInt(3, rdto.getReply_origin());
		
		
		ps.execute();
		
		con.close();
		
		
		
		
	}

	public void delete(int reply_no) throws Exception {
		Connection con = getConnection();

		String sql = "DELETE reply WHERE reply_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, reply_no);
		ps.execute();
		
		con.close();
	}
		
		
		
	

	
	
	
	
}
