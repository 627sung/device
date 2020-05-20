package api.collection;

import java.util.Random;

public class Test09 {
	public static void main(String[] args) {
		//임시비밀번호 발급
		//사용자에게 프로그램을 실행하면 다음규칙에 맞게 임시 비밀번호를 발급하여 화면에 출력 
		//규칙 자릿수는 총 10개의 글자로 구성!
		//-숫자,영어,대/소문자 랜덤구성되어있음 
		//똑같은 글자는 여러번 나올수 있습니다. 
		//결과는 스트링으로 나온다 ..
		// 가급적 스트링 버퍼를 쓰세요 

	
		char[] data = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'a', 'b', 'c', 'e', 'f' ,'g', 'h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};

		System.out.println("임시번호추출!");
		StringBuffer pw = new StringBuffer();
		
		
	for(int i =0; i<10; i++) {
		Random r= new Random();
		int n=r.nextInt(data.length);
		pw.append(data[n]);
		
	}
		
		System.out.println(pw.toString());


		
	
		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
		
		

	
		
		
		
		
		
		
		
		
		
		
	
	}
}
