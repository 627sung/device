package api.lang.Wrapper;

public class Test02 {
public static void main(String[] args) {
  
	//63을 2진수로 변경 
	String str = Integer.toBinaryString(63);
	System.out.println(str);

   	//10+20 =  
	//불편하고 귀찮다.  복잡하다 ..  이경우 원시형이 더 편리하다..
	Integer a= new Integer(10);
	Integer b= new Integer(20);
	Integer c = Integer.sum(a,b);
	System.out.println(c);

	
	//원시형이 좋을떄도 있고 참조형이 좋을때도 있다. 참조형은 메소드가져다가 쓰기에 좋다..
	//그러니 적당히 잘 섞어서 써라 =>> 하이브리드 
	
	
	
	
	
   	
   	
   	
}
	
           	
      
}
