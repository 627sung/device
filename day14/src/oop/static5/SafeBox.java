package oop.static5;

public class SafeBox {


	private static int  standardRate = 2;

	private String name;
	private 	double premiumRate;
	private  long credit;
	
	//게터와 세터 
	
	public static void setStandardRate(int standardRate) {
		SafeBox.standardRate = standardRate;
	}
	public static int getStandardRate() {
		return standardRate;
	}
	
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setPremiumRate(double premiumRate) {
		
		this.premiumRate = premiumRate;
	}
	public double getPremiumRate() {
		return this.premiumRate;
	}

	public void setCredit(long credit) {
		if(credit<0) return;
	  this.credit = credit;

	}
	
	public long getCredit() {
		return this.credit;
	}
	
	///생성자 .....
	
	
	
	
	
	public SafeBox(String name ) {
		this(name , 0 ,0);
	}
	public SafeBox(String name,  double premiumRate) {
		this(name, premiumRate,  0);
	}
	
	public SafeBox(String name,  double premiumRate ,int credit) {
		this.setName(name);
		this.setPremiumRate(premiumRate);
		this.setCredit(credit);
	}
	
	public void output() {
		System.out.println("SafeBox 가입자 정보");
		System.out.println("예금자명  "+this.name+"%");
		System.out.println("기본이율  "+SafeBox.standardRate+"%");
		System.out.println("우대이율  "+this.premiumRate+"%");
		System.out.println("예금액  "+this.credit+"원");
		System.out.println(" ");
		
	}

	
	
	
	
	
}
