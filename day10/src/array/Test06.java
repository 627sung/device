package array;

public class Test06 {

	public static void main(String[] args) {
		
		
		//배열에 내장되어 있는 값;;
		int[] data = new int[] {3,5,2,1,4};  //크키가 가변 ... 크기를 모르면 주문제작 ->참조형 
															//크기 변경이 잘 안되니 딱맞게 
		System.out.println( "data의 길이"+data.length);
		

		for(int i = 0 ; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		
	}

}
