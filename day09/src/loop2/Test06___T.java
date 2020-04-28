package loop2;

public class Test06___T {

	public static void main(String[] args) {
		// 다른방법으로 접근;
		// 자릿수가 달라져도 똑같이 처리하려면 어떻게 해야하는가?
		// 어느 숫자가 들어오던간에 매자리를 검사하도록 구현

		// 앞의 예제를 반복문화
		int n = 123;

		int count = 0;
		for (int i = n; i > 0; i /= 10) {
			//System.out.println(i % 10); // 1의 자리를 추정

			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				count++;
			}

		}

		if (count == 0) {// 3 6 9 가 없으면
			System.out.println(n);
		}
		else {    //3,6,9가 있으면   -count 번 박수릂친다.
		for(int i =0; i<count; i ++) {
			System.out.println("짝");
		}
		System.out.println();//엔터
		}
	}

}
