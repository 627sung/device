package basic;

public class Test20_T {

	public static void main(String[] args) {
		
		//생년월일 8자리 정수
		int birth = 20010715;
		
		//계산 : 생년4자리, 나이, 성인 ?
		int year = birth /10000;
		System.out.println(year);
		
		int age = 2020 - year + 1;
		System.out.println(age);
		
		boolean adult  = age >= 20;
		
		
		//결과
		System.out.println(adult);
	}

}
