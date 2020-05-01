package sort;

public class Test02_1 {

	public static void main(String[] args) {
			//버블정렬 구현 6 5 3 1 8 7 2 4
		
		int [] data = new int[] {6,  5 ,  3,  1,  8,  7, 2,  4};
	//                                    [0] [1] [2] [3] [4] [5] [6] [7]
	
			
		
		
		for(int k=data.length-1; k>0; k--) {
			System.out.println("싸이클시작");
			for(int i =0; i<k; i++){
				System.out.println("["+i+"]"+"vs"+"["+(i+1)+"]");
				
				if(data[i]>data[i+1]) {
					int tmp = data[i];
					data[i]=data[i+1];
					data[i+1] = tmp;
					
					
					
				}
				
				
			}
	
		}
		
			//출력
			for(int i =0; i<8;i++) {
				System.out.println(data[i]);
			}
			
	
		
	}	
	}	

