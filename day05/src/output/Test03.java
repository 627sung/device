package output;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		//실수입력받기 
		
		System.out.println("키를 입력하시오");
		
		
	//도구생성
		Scanner sc = new Scanner(System.in);
		
		double cm = sc.nextDouble();
		
		System.out.println("입력하시는 키는 " + cm);
		
		
		
		sc.close();
		
		
		
		
		
	}
}
