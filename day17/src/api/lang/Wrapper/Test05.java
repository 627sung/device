package api.lang.Wrapper;

public class Test05 {
	public static void main(String[] args) {
		//주의사항 Integer만 가질 수 있는 값이 있다. 
		// null 이 포함된 계산을 할 경우 int사용불가(예외발생);
		Integer a = null;
//		int b = null;
		int b = a; 
		System.out.println(b);
		
		
		
		
	}
}
