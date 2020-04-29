package array;

public class Test10 {

	public static void main(String[] args) {
		//배열 위치 가지고 노는 작업
		// 배열에 ?번 위치랑 ?번 위치를 바꾸시오
		//정렬과 셔플을 할수가 있다.    
		
		//1과 3을 바꾸어보자 ;'
		int[] data =new int [] {3  ,5,  2,  1, 4};
	                                  // [0][1][2][3][4] ; 	
		
		//자바는 맞교환을 못한다 맞교환하려고 하면 덮어쓰여져 버린다. 
		
		
		//정상적인 코드 임시변수를 하나 만들어서 
		//임시변수 만들어서 자리 바꾼다.
		int tmp = data[3];
		data[3] =data[0];
		data[0]=tmp;  
		
		 tmp = data[4];
		data[4] =data[1];
		data[1]=tmp;  
		
		
		
		
		
		for(int i=0; i <data.length; i++) {
			System.out.println(data[i]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
