package oop.inherit4;

public class Test01 {
public static void main(String[] args) {
	
	Chrome c = new Chrome();
	c.url="www.google.com";
	c.version="2.0.c";
	c.move();
	c.back();
	c.store();
	
	Firefox f= new Firefox();
	f.url="www.firefox.com";
	f.version="2.0.F";
	f.move();
	f.back();
	 
	
	
	
}
}
