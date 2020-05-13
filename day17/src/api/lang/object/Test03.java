package api.lang.object;

public class Test03 {
	public static void main(String[] args) {
		Sample s = new Sample();
		//이론상 s가 가진 구성요소는 없다 .
		
		System.out.println(s.getClass()); 
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		
		//object는 자동으로 상속된다. 따로 상속할필요 x 모든 상위 클래스의 끝은 object 
		// object 단군할아버지같은 느낌 ..부모의 부모의 부모의 부모의 부모 ....
	}
}
