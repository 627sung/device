package oop.modifier4;

public class Client {
	private String id;
	private String nickname;
	private String power;
	private Address addr;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public String getPower() {
		return this.power;
	}
	
	//배송지 .......
	
	public void setAddr(Address addr) {
		this.addr=addr;
		
	}
	
	public Address getAddr() {
		return this.addr;
	}
	
	//주소x
	public Client(String id,String nickname, String power) {
	//	this.setId(id);
	//	this.setNickname(nickname);
	//	this.setPower(power);
		
		this(id, nickname, power, null);
	}
	
	//주소 o
	
	public Client(String id,String nickname, String power, Address addr) {
		this.setId(id);
		this.setNickname(nickname);
		this.setPower(power);
		this.setAddr(addr);

	}
	
	public void output() {
		System.out.println("[고객정보]");
		System.out.println("아이디"+this.id);
		System.out.println("닉네임"+this.nickname);
		System.out.println("등급"+this.power);
		
		if(addr ==null) {
			System.out.println("주소지없음");
		}else {
			System.out.println(this.addr.getFullAddress()  );
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
