package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//Runtime 클래스 
		// new를 이용한 생성은 불가능하고 생성명령을 사용해야함 (싱글톤)
		//종료하면서 다른프로그램을 실행시키는 등의 작업을 수행할 수 있다. 
		
	//	Runtime r= new Runtime();
		Runtime r =Runtime.getRuntime();
	//	r.exec("notepad");//메모장
	//	r.exec("calc"); //계산기
	//	r.exec("mspaint");//그림판
		r.exec("cmd /c start http://www.sysout.co.kr");
		
		
	}
}
