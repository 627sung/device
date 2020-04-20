package basic;
import java.lang. *;
public class Test06 {
public static void main(String[] args) {
	// 삼각김밥 개당 900원 1+1 행사중 행사중인걸 모르고 5개를 샀다 내야할돈은 얼마일까요?
	//준비
	/* 갯수 유료 무료      
	    1  1  0
	    2  1  1 
  	    3  2  1 
        4  2  2	
        5  3  2 
        6  3  3
        7  4  3 
        8  4  4
        9  5  4 
        10 5  5          
 	*/
	int gimbobPrice = 900;
	int gimbobCount =  5 ;   //  

	//계산하는것 무료갯수 구하기
	int freeCount = gimbobCount/  3 ;
	int payCount = gimbobCount - freeCount;
	int price  =payCount* gimbobPrice;
	
	
	//출력		
	System.out.println(price);
	
	
	// 2 + 1 
	
	
	
	
}
}
