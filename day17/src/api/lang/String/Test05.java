package api.lang.String;

public class Test05 {
public static void main(String[] args) {
	
	//문자열 편집
	//-대소문자변환 
	//-치환 =찾아바꾸기 
	
	String str= "Hello Java!";
	System.out.println(str.toLowerCase());  //소문자변환
	System.out.println(str.toUpperCase());   //대문자변환 
	

	//불필요한 여백제거 
	String url = ("             HTTP://WWW.NAVER.COM            ");   //trim 앞뒤 필요없는 공간제거 ..
	System.out.println(url.trim());
	System.out.println(url.toLowerCase());
	
	String test = "나는 자바가 좋아요 ";
	System.out.println(test);
	System.out.println(test.replace("자바","피자"));
	
	test=test.replace("자바", "피자");
	
	
	System.out.println(test.replace("좋아","싫어"));

	
	
	
}
}
