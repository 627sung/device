package basic;

public class check {

	public static void main(String[] args) {
char a = '각';
		
		System.out.println(a);
	
		int A = 1;
		int N = 49;
		

		boolean number = (A >= '0') && (A <= '9');
		boolean han = (A >= '가') && (A <= '힣');

		System.out.println("숫자인가요?");
		System.out.println(number);
		System.out.println("한글인가요?");
		System.out.println(han);

		
		boolean number1 = (N >= '0') && (N <= '9');
		boolean han1 = (N >= '가') && (N <= '힣');
		
		
		System.out.println("숫자인가요?");
		System.out.println(number1);
		System.out.println("한글인가요?");
		System.out.println(han1);

	}

}
