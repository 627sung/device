package api.lang.String;

public class LoginManager {
	private User[] data = new User[3];
	public LoginManager() {
		data[0] = new User("master", "master1234");
		data[1] = new User("tester", "test1234");
		data[2] = new User("admin", "admin1234");
	}
	
	public boolean login(String id, String password) {
		int count = 0;
		for(int i=0; i < data.length; i++) {
			if(id.equalsIgnoreCase(data[i].getId()) && password.equals(data[i].getPassword())) {
				count++;
				break;
			}
		}
		
		if(count == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}

