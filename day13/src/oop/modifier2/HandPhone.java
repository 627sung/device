package oop.modifier2;

public class HandPhone {
	private String name;
	private String telecom;
	private int price;
	private int agreement;

	public void setName(String name) {
		this.name = name;
	}

	public void setTelecom(String telecom) {
		switch (telecom) {
		case "SK":	case "sk":case "Sk":case "sK":
		case "LG":case "Lg":case "lg":case "lG":
		case "KT":case "Kt":case "kt":case "kT":
		case "알뜰폰":
			this.telecom = telecom;
		}

	}

	public void setPrice(int price) {
		if (price < 0) {
			return;
		}
		this.price = price;

	}

	public void setAgreement(int agreement) {
		if (agreement % 6 != 0 || agreement < 0) {
			return;
		}
		this.agreement = agreement;

	}

	public String getName() {
		return this.name;
	}

	public String getTelecom() {
		return this.telecom;
	}

	public int getPrice() {
		return this.price;
	}

	public int getAgreement() {
		return this.agreement;
	}

	// 생성자 ....
	HandPhone(String name, String telecom, int price, int agreement) {
		this.setName(name);
		this.setTelecom(telecom);
		this.setPrice(price);
		this.setAgreement(agreement);
	}

	void output() {
		System.out.println("기종명  " + this.name);
		System.out.println("통신사  " + this.telecom);
		System.out.println("가격  " + this.price + "만 원");
		System.out.println("약정  " + this.agreement + "개월");
		System.out.println(" ");

	}

}
