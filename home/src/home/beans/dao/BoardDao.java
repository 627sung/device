package home.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import home.beans.dto.BoardDto;

public class BoardDao {

	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
		}
	
	public List<BoardDto> get() throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM board";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto  bdto= new BoardDto();
			list.add(bdto);
		}
		
		con.close();
		
		return list;
	
		
		
		

	}
	 
	
}
