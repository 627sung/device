package oop.base2;

public class Test02 {

	public static void main(String[] args) {
		// Olympic 을 이용하여 객체 생성 
		Olympic a=new Olympic();
		Olympic b=new Olympic();
		Olympic c=new Olympic();

		
		//김연아
		a.player="김연아";
		a.event="피겨스케이팅";
		a.gold=3;
		a.silver=1;
		a.bronze=0;
		
			
		//이상화
		b.player="이상화";
		b.event="스피드스케이팅";
		b.gold=2;
		b.silver=3;
		b.bronze=3;
		
		
		//윤성빈
		c.player="윤성빈";
		c.event="스켈레톤";
		c.gold=1;
		c.silver=0;
		c.bronze=1;
		
		
		
		
		System.out.print(a.player+"\t");
		System.out.print(a.event+"\t");
		System.out.print(a.gold+"\t");
		System.out.print(a.silver+"\t");
		System.out.print(a.bronze+"\t");
		System.out.println("");
		
		System.out.print(b.player+"\t");
		System.out.print(b.event+"\t");
		System.out.print(b.gold+"\t");
		System.out.print(b.silver+"\t");
		System.out.print(b.bronze+"\t");
		System.out.println("");

		
		System.out.print(c.player+"\t");
		System.out.print(c.event+"\t");
		System.out.print(c.gold+"\t");
		System.out.print(c.silver+"\t");
		System.out.print(c.bronze+"\t");
		
		
		
		
		
		
		
		
	}

}
