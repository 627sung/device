package oop.objectarray;

public class Test01 {

	public static void main(String[] args) {
		//주사위를 2번씩 10세트 던진결과 
		//[1] 2차원 배열 -10줄 ,2칸
		//[2] 객체배열 풀이 ... 세트 객체 10개   - 1차원 배열 ....
		//-주의 객체배열을 만든다고 객체가 생기는것이 아니다. 
		//int[] data=new int[10];
		DiceSet[] data=new DiceSet[10];//DiceSet을 10개를 보관하는 배열  10칸을 만들었다.
		
	
		for(int i =0; i<data.length;i++) {
		data[i]=new DiceSet();
		}
		
		for(int i =0; i<data.length;i++) {
			data[i].output();
		}
		
		
	}

}
