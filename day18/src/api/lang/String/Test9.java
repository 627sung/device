package api.lang.String;

public class Test9 {
	public static void main(String[] args) {
	//문자열에서 절대 하면 안되는 행동'
		// 문자열에서는 +는 "연결"을 의미
		// -연결 남발해선 안된다..
		StringBuilder builder = new StringBuilder();// 저장소
		String str = "";
		
		long  start = System.currentTimeMillis(); // 1/1000초  시작시간의 측정 
		
		
		for(int i =0; i<100000 ; i++) {
		//	str+="hello\n";
		builder.append("hello");
		builder.append("\n");
		}
		
		long  finishi = System.currentTimeMillis(); // 1/1000초 종료시간의 측정

		System.out.println(builder.toString());
		
		
		System.out.println(str);
		System.out.println(start);
		System.out.println(finishi);
		System.out.println(finishi-start);
		
		
	}
}
