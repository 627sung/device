package api.lang.String;

public class Test01 {
	public static void main(String[] args) {

		String a = "hello";
		String b= new String("hello");
		String c = "Hello";
		
		System.out.println(a==b);//리모콘이 같니?

		System.out.println(a.equals(b)); //내용이 같니?
	
		System.out.println(b.equals(c)); //내용이 같니??

		
		System.out.println(b.equalsIgnoreCase(c));//내용이 같니? 대소문자 구분x;
	}
}
