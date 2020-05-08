package oop.static5;

public class Test01 {
	public static void main(String[] args) {
		
	
		SafeBox a =new SafeBox("손오공",0.5,10000000);
		SafeBox b =new SafeBox("베지터",0.3,-20000000 );
		SafeBox c =new SafeBox("부르마",0.5,20000000);

	
	
		a.output();
		b.output();
		c.output();

	}
}
