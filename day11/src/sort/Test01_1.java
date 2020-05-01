package sort;

public class Test01_1 {

	public static void main(String[] args) {
		int[] data = new int[] { 3, 5, 2, 1, 4 };
		
//		최소값이 들어있는 위치를 찾는 코드

//		계산
		int number = 0;//0이 제일 작은 값이 들어있는 위치라고 가정(맨앞)
		
//		1번부터 4번까지 반복하며 number의 위치와 비교
		for(int i = number + 1; i < data.length; i++) {
			System.out.println(number+"위치와 "+i+"번 위치의 값을 비교");
			System.out.println(data[number] + " vs " + data[i]);
			
			if(data[number] > data[i]) {//더 작은 값이 나오면
				number = i;
			}
		}
		
//		출력
		System.out.println("최소값이 들어있는 위치는 "+number);
	}
}

		
		
		
		
		