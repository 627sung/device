package api.lang.Wrapper;

public class Test04 {
	public static void main(String[] args) {

		//주의사항 :객체비교는  .equals를 사용한다.
		Integer a = new Integer (10);
		Integer b = new Integer (10);

		
		//Q .a랑 b랑 같니?? 
		System.out.println(a==b); //동일한가??
		//객체끼리 비교할때 equals 사용 
		System.out.println(a.equals(b)); //동등한가? 객체비교는 equals 사용합니다.
		
		int c =10;
		int  d =10;
		
		
	}

}
