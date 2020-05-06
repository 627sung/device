package oop.base3;

public class Test03 {

	public static void main(String[] args) {

		
		//객체생성
	 cafe a= new cafe();
	 cafe b= new cafe();
	 cafe c= new cafe();
	 cafe d= new cafe();

		
		
	 //데이터초기화
		//아메리카노
		a.name="아메리카노";
		a.kind="음료";
		a.price=1800;
		a.isEvent=true;
		
		
		//프라푸치노
		b.name="프라푸치노";
		b.kind="음료";
		b.price=3500;
		b.isEvent=false;
		
		
		//파니니
		c.name="파니니     ";
		c.kind="식사";
		c.price=2800;
		c.isEvent=true;
		
		
		//크로크무슈
		d.name="크로크무슈";
		d.kind="식사";
		d.price=3300;
		d.isEvent=false;
		
		
		
	//출력	
		
		//아메리카노
		System.out.print(a.name+"\t");
		System.out.print(a.kind+"\t");
		System.out.print(a.price+"\t");
		System.out.print(a.isEvent+"\t");
		
		System.out.println();
		//프라푸치노
		System.out.print(b.name+"\t");
		System.out.print(b.kind+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.isEvent+"\t");

		
		System.out.println();
		//파니니
		System.out.print(c.name+"\t");
		System.out.print(c.kind+"\t");
		System.out.print(c.price+"\t");
		System.out.print(c.isEvent+"\t");

		
		System.out.println();
		
		//크로크무슈
		System.out.print(d.name+"\t");
		System.out.print(d.kind+"\t");
		System.out.print(d.price+"\t");
		System.out.print(d.isEvent+"\t");

		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
