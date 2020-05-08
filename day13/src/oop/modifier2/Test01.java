package oop.modifier2;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandPhone a = new HandPhone("iphone11", "SK", 160, 24);
		HandPhone b = new HandPhone("Galxay20", "SK", 155, 24);
		HandPhone c = new HandPhone("V60     ", "LG", 130, 18);
		HandPhone d = new HandPhone("Z-Flip    ", "kt", 190, 36);

		a.output();
		b.output();
		c.output();
		d.output();
		
		
		//getter 메소드 가지고 있는 정보를 끄집어 낼떄 
		
		if(a.getPrice()>b.getPrice()) {
			System.out.println(a.getName());
		}
		else if(a.getPrice()<b.getPrice()) {
			System.out.println(b.getName());
		}
		else {
			System.out.println("둘이 같은디요");
		}
		
		
		
		
		
		

	}

}
