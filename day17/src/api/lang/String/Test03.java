package api.lang.String;

public class Test03 {

	public static void main(String[] args) {
				//문자열 검사 .. 
		//??으로 시작하나요  : StartsWith()
		//??으로 끝나나요?? : endsWith()
		//??들어있나요?  : contains(), indexOf()
		//길이는 얼마인가요? length();
	
	
	
	String url = "http://www.naver.com";
	System.out.println(url.startsWith("http://")); // ~으로 시작합니까?
	System.out.println(url.startsWith("https://"));//~으로 시작합니까?

	System.out.println(url.endsWith(".com")) ; //~~으로 끝이납니까?
	System.out.println(url.endsWith(".net")) ;  //~~으로 끝이납니까??

	System.out.println(url.contains("naver"));  //~가 있나요?
	System.out.println(url.indexOf("naver"));   //어디에 있나요?  , -1나오면 없어요 /
	
	System.out.println(url.length());
	
	//마지막 글자가 뭐에요?
	//19번째에 뭐가 잇나용?
	System.out.println(url.charAt(url.length()-1));
	
	
	
	
	
	
	
	
}
}