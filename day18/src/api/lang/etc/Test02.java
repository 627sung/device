package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {
			//System 클래스 
		//System.in 표준입력통로
		//System.err 표준에러통로
		//프로그램 종료명령과 운영체제 정보  확인 .........  
		
		System.out.println("안녕하세요 ");
		System.err.println("에러라서 붉은색");
		
		long time = System.currentTimeMillis();
		System.out.println(time);

		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println(System.getProperty("os.name"));
		
		
		if(System.getProperty("os.name").toLowerCase().contains("Windows")) {
			System.err.println("윈도우에서만 작동이 가능합니다");
			System.exit(0); //프로그램종료 
		}else {
			System.out.println("현재 윈도우를 사용중입니다. ");
			System.exit(0); //프로그램종료 
			System.out.println("나옴?");
		}
		
		
		
		
		
		
		
	
		
		
		
		
		
	}
}
