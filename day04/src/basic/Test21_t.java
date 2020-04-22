package basic;
	import java.lang. *;
public class Test21_t {

	public static void main(String[] args) {
		//준비
		char c = 'z';
		//계산
		//boolean isNumber = c >= '48' && c<= '57';
		boolean isNumber = c >= '0' && c<= '9';   //숫자인가?                  
     // boolean isKorean = (자음 / 모음에 해당?) 또는 (완전한 글자?); 
	  // boolean isKorean = (ㄱ과 ㅣ 사이인가?) 또는 (가 와 힣 사이인가??)
	 boolean isKorean = (c>= 'ㄱ' && c<= 'ㅣ') || (c>='가' && c <= '힣');
	  //	boolena isAlpha  =(대문자 또는 소문자?);
	 boolean isAlpha = (c >= 'A' && c <= 'Z') ||(c>='a'  && c <= 'z' );
		
		
	System.out.println(isNumber);	
	System.out.println(isKorean);	
	System.out.println(isAlpha);	

	 
	 
		
		//출력
		//c가 숫자인가? 
		//c가 한글인가? 
		//c가 알파벳인가?
		//
		
		
	}

}
