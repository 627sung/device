package basic;
import java.lang.*;

public class Test13 {
	public static void main(String[] args) {
	
	//키 180cm 몸무게 80kg인 사람의 bmi구하기 
	  //키 1.8m  
	double cm = 180 ;
	double kg = 80;
	double m = cm /100 ;
	
	double bmi = kg/( m*m );
	
	System.out.println(bmi);
	
	bmi = bmi * 100;   System.out.println(bmi);  //소수점 2자리 변경
	bmi = (int)bmi; 	 System.out.println(bmi);  // 소수점 버리고 
	bmi = bmi /100;	 System.out.println(bmi);   //소수점 2자리 좌측이동 
	

	System.out.println(bmi);
	
	
	//소수점 2자리로 값수정하기 
	
	
	
	

	
	
		


	}
	
	
	

}
