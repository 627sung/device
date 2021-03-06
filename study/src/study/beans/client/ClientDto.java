package study.beans.client;

public class ClientDto {
	private int client_no;
	private String client_id;
	private String client_pw;
	private String client_auth;
	private String client_join;
	private int client_point;

	public ClientDto(int client_no, String client_id, String client_pw, String client_auth, String client_join,
			int client_point) {
		super();
		this.client_no = client_no;
		this.client_id = client_id;
		this.client_pw = client_pw;
		this.client_auth = client_auth;
		this.client_join = client_join;
		this.client_point = client_point;
	}

	public ClientDto() {
		super();
	}

	public int getClient_no() {
		return client_no;
	}

	public void setClient_no(int client_no) {
		this.client_no = client_no;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_pw() {
		return client_pw;
	}

	public void setClient_pw(String client_pw) {
		this.client_pw = client_pw;
	}

	public String getClient_auth() {
		return client_auth;
	}

	public void setClient_auth(String client_auth) {
		this.client_auth = client_auth;
	}

	public String getClient_join() {
		return client_join;
	}

	public void setClient_join(String client_join) {
		this.client_join = client_join;
	}

	public int getClient_point() {
		return client_point;
	}

	public void setClient_point(int client_point) {
		this.client_point = client_point;
	}

}
