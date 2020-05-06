package sort;

import java.util.Random;

public class Test4_1 {

	public static void main(String[] args) {
		// 빙고풀이
		//1. 1차원배열로 만든뒤 2차원 배열로 복사.
		//2.2차원 배열에 배치한뒤 셔플 또는 위치순서대로 랜덤배치
		//1부터 순서대로 랜덤한 위치에 배치{실제와 가장 유사한 방식}
		Random r= new Random();
		int[] data = new int [25];
		
	

		
		
	
		
		
		//(2) 순서대로 넣어놓고 셔플;
		int number = 1;
		for(int i =0; i<data.length; i++) {
			data[i]=number;
			number++;
		}
		
		
		
		for(int i =0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		
	}

}
