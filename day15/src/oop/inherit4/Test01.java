package oop.inherit4;

public class Test01 {
public static void main(String[] args) {
	
	Chrome c = new Chrome();
	c.setUrl( "www.google.com");
	c.setVersion("80");
	c.move();
	c.back();
	c.store();
	
	Firefox f= new Firefox();
	f.setUrl("www.firefox.com");
	f.setVersion("2.0.F");
	f.move();
	f.back();
	 
	
	
	
	
}
}
