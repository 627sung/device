package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {

		GalaxyS10 a = new GalaxyS10();
		a.number = "010-4216-7814";
		a.output();
		a.call();
		a.sms();
		a.bxiby();
	
		System.out.println("");
		
		GalaxyNote10 b =new GalaxyNote10();
		b.number = "010-4216-7814";
		b.output();
		b.call();
		b.sms();
		b.memo();
		
		System.out.println("");

		Iphone10 c= new Iphone10();
		c.number = "010-4212-7894";
		c.output();
		c.call();
		c.sms();
		c.airDrop();
		c.itunes();
		
		System.out.println("");

		Iphone11 d= new Iphone11();
		d.number = "010-4178-5712";
		d.output();
		d.call();
		d.sms();
		d.airDrop();
		d.siri();
		
		
		
		
		
		
		
		
	
	
	}
}