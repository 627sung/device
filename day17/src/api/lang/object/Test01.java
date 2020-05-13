package api.lang.object;

public class Test01 {
	public static void main(String[] args) {

		//남이만든 클래스인 object 사용해보기 
		Object a= new Object();
		
		String b= a.toString(); //  객체요약정보를 알아보는 명령 
		System.out.println(b);
		
		int c = a.hashCode(); //일렬번호(해시코드) 확인하는 명령 
		System.out.println(c);
	
		Object d= new Object();  //a와 d는 다른객체... 일렬번호가 달라서 
		System.out.println(d.hashCode());
	}

}
