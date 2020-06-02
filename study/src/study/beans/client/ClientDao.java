package study.beans.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

	//연결 메소드
		public Connection getConnection() throws Exception {
			Class.forName("oracle.jdbc.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","study","study"  );
		
		}
		
		//등록메소드 
		
		public void regist (ClientDto cdto) throws Exception{
			Connection con = getConnection();
			
			String sql = "insert into client values(client_seq.nextval,?,?,'일반회원',sysdate,0)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,cdto.getClient_id());
			ps.setString(2,cdto.getClient_pw());

			
			
			ps.execute();
			
			con.close();
			
		}
		
		
		
		public List<ClientDto>getList() throws Exception{
			
			Connection con =getConnection();
			
			String sql = "SELECT * FROM client ORDER BY client_no asc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			
			List<ClientDto>list = new ArrayList();
			
			while(rs.next()) {
				ClientDto cdto = new ClientDto();
				cdto.setClient_no(rs.getInt("client_no"));
				cdto.setClient_id(rs.getString("client_id" ));
				cdto.setClient_pw(rs.getString("client_pw" ));
				cdto.setClient_auth(rs.getString("client_auth" ));
				cdto.setClient_join(rs.getString("client_join" ));
				cdto.setClient_point(rs.getInt("client_point" ));

				list.add(cdto);

			}
			con.close();
			return list;
			
		}
	
		
		
		
	
	
	
	
}
