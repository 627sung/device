package api.lang.String;

public class Test08 {
	public static void main(String[] args) {
		//문자열 변환 (기본형)  8가지 
		
		int a =10;
	//	String b = a;  형태가 안맞아서 안들어간다 .. 그렇다면 캐스팅을 통해 넣어볼까?
	//	String b = (String)a;  응 안되~~ ex) 10kg 를 10m로 바꿀수 잇나?
		
	//	String b= ""+a; // 편법으로는 가능하다... 
	
		String b= String.valueOf(a);
		
		System.out.println(b);
		
		String c=  "123";
		//int d = (int )c;
		int d = Integer.parseInt(c);    //스트링타입 c를 int형태로 데이터형을 변환한다. 
		System.out.println(d);
		
		
	}
}
