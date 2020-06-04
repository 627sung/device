package study.beans.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javafx.css.PseudoClass;

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
	
		
		
		//검색메소드
		public List<ClientDto> search(String keyword) throws Exception {
			Connection	con = getConnection();
			String sql = "SELECT * FROM client WHERE instr(CLIENT_ID, ?)>0 or instr(CLIENT_AUTH , ?)>0 order by client_no asc";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, keyword);
			ps.setString(2, keyword);
			ResultSet rs = ps.executeQuery();

			List<ClientDto>list = new ArrayList<>();
			
			while(rs.next()) {
				ClientDto cdto = new ClientDto ();
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

		public ClientDto get(int client_no) throws Exception {
			Connection con = getConnection();
			String sql = "select * from client where client_no =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, client_no);
			ResultSet rs = ps.executeQuery();

			ClientDto cdto;
			if (rs.next()) {
				cdto = new ClientDto();
				cdto.setClient_no(rs.getInt("client_no"));
				cdto.setClient_id(rs.getString("CLIENT_ID"));
				cdto.setClient_pw(rs.getString("CLIENT_PW"));
				cdto.setClient_auth(rs.getNString("CLIENT_AUTH"));
				cdto.setClient_join(rs.getString("CLIENT_JOIN"));
				cdto.setClient_point(rs.getInt("CLIENT_POINT"));

			} else {
				cdto = null;
			}
			con.close();
			return cdto;

		}

		public boolean login(String cilent_id, String cilent_pw) throws Exception {
			
			Connection con = getConnection();
			String sql = "SELECT * FROM CLIENT WHERE Client_id = ? AND CLIENT_PW= ?" ;
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cilent_id);
			ps.setString(2, cilent_pw);
			ResultSet rs = ps.executeQuery();
			
			boolean result =rs.next();
			
			con.close();
			
			return result;
			
				
			}

		
		public ClientDto login(ClientDto cdto) throws Exception {
			Connection con = getConnection();
			
			String sql = "SELECT * FROM CLIENT WHERE Client_id = ? AND CLIENT_PW= ?" ;
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cdto.getClient_id());
			ps.setString(2, cdto.getClient_pw());
			ResultSet rs = ps.executeQuery();
			
			ClientDto newDto;
			if(rs.next()) {
				newDto = new ClientDto();
				
				newDto.setClient_no(rs.getInt("client_no"));
				newDto.setClient_id(rs.getString("client_id"));
				newDto.setClient_pw(rs.getString("client_pw"));
				newDto.setClient_auth(rs.getString("client_auth"));
				newDto.setClient_join(rs.getString("client_join"));
				newDto.setClient_point(rs.getInt("client_point"));
			}else {
				newDto =null;
			}
			
			con.close();
			
			return newDto;
		}

		public void edit(ClientDto cdto) throws Exception {//회원정보를 수정하지만 반환하는 값은 없다.  회워 
			Connection con =getConnection();
			
			String sql ="UPDATE client SET client_pw=? WHERE client_id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, cdto.getClient_pw());
			ps.setString(2, cdto.getClient_id());
			ps.execute();
			
			con.close();
			
			
			
			
		}

		public void delete(String client_id) throws Exception {//반환형업다 리턴값x
			Connection con =getConnection();
			String sql = "DELETE FROM client WHERE client_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"Client_id");
			ps.execute(); //결과가 필요치않음... Resultset을 해줄 필요가없다. 
			
			con.close();
			
			
		}
	}

	
	

