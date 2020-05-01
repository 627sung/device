package array2d;

public class Test01 {

	public static void main(String[] args) {
		//배열의 정렬  (sort) 
		//데이터를 원하는 순서대로 변경하는것 ........
		// 정렬을 해야하는 이유가 있을까?
		// 원하는 방식에따라서 오름차순( ascending)  내림차순(descending)으로 구별합니다 
		//방식이 청소와 비슷합니다. 
		
		int[] data = new int[] {3,5,2,1,4};
		
	for(int k=0; k<4;  k++) {
		int number = k;
		for(int i =number +1; i<data.length;i++) {
		if(data[number] > data[i]  ) {
				number =i;
		}
		
	}
	
			int tmp = data[k];
			data[k] =data[number];
			data[number]=tmp;
						
		
	}
		
		
		
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		
		
		
		
	}	
	
}
