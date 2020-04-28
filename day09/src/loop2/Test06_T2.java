package loop2;

public class Test06_T2 {

	public static void main(String[] args) {
			
	//	[1] 어떤 숫자가 주어졌을때 이 숫자의 10의자리와 1의자리 검사 
 				int n =66;
		
		int a = n/10;
		int b= n%10;
		
		int count = 0;
		
		//10의 자리가와 1의자리를 각각검사
		if(a ==3 || a==6 || a==9 ) {
			count++;
		}
		
		if(b== 3 || b==  6|| b==9 ) {
			count ++;
		}
		//결과를 출력
		switch (count) {
		case 0 : System.out.println(n); break;
		case 1 : System.out.println("짝!"); break;
		case 2 : System.out.println("짝짝!"); break;
		}
		
		
		}

	}