package oop.modifier4;

public class Address {
	
	
 private	String zipcode;
 private	String baseAddr;
 private String detailAddr;
	
	
 
 	public Address(String zipcode, String baseAddr, String detailAddr) {
 		this.setZipcode(zipcode);
 		this.setBaseAddr(baseAddr);
 		this.setDetailAddr(detailAddr);
 
 	}
 	
 
 
 
 	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
 	public String getZipcode() {
		return this.zipcode;
	}
 	
 	public void setBaseAddr(String baseAddr) {
		this.baseAddr = baseAddr;
	}
 	
 	public String getBaseAddr() {
		return this.baseAddr;
	}
 	
 	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
 	
 	public String getDetailAddr() {
		return this.detailAddr;
	}
 	
 	
 	//필요에 의해생성
 	public String getFullAddress() {
 		return  "["+this.zipcode+"]"+this.baseAddr+ this.detailAddr;
 	}
 	
 
 
 
 
 
	
	

}
