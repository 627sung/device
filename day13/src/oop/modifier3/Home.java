package oop.modifier3;

public class Home {
	private int size;
	private int room;
	private int toilet;
	private boolean balcony;
	private long price;

	// 세터

	public void setSize(int size) {
		switch (size) {
		case 25:case 28:case 31:case 34:case 45:
			this.size = size;
			break;
		}
	}

	public void setRoom(int room) {
		if(room>0) {
		this.room = room;
		}
	}

	public void setToilet(int toilet) {
		if(toilet>0) {
			this.toilet = toilet;
		}
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public void setPrice(long price) {
		if(price>=0) {
			this.price=price/1000000*1000000;
	              
		}
	}

	// 게터

	public int getSize() {
		return this.size;
	}

	public int getRoom() {
		return this.room;
	}

	public int gettoilet() {
		return this.toilet;
	}

	public boolean getBalcony() {
		return this.balcony;
	}

	public long getPrice() {
		return this.price;
	}
	//필요에 의하여 만든 메소드
	public long getDiscountPrice() {
		return this.price*95/100/1000000*1000000;
	}

	// 생성자
	public Home(int size, int room, int toilet, long price) {
		this(size,room, toilet,false,price);
	}
	
	public Home(int size, int room, int toilet, boolean balcony, long price) {
		this.setSize(size);
		this.setRoom(room);
		this.setToilet(toilet);
		this.setBalcony(balcony);
		this.setPrice(price);
		
	}

	public void output() {
	
		
		
		
		
		
		System.out.println("평형  " + size);
		System.out.println("방개수  " + room);
		System.out.println("화장실개수  " + toilet);
		System.out.println("발코니확장여부  " + balcony);
		System.out.println("가격  " + price);
		System.out.println("할인가격="+this.getDiscountPrice());
		System.out.println("");

	}

}
