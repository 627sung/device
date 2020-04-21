package basic;
import java.lang.*;
public class Test19 {

	public static void main(String[] args) {
		//준비
		int adult = 10000, youth =7000 ;  //요금
		int sale = 25;	                  //세일
		double cardsale = sale / 100.0 ;  //세일비율
		
		//계산
		int movie = adult*2 + youth*3;   //할인전 요금
		double moviesale = movie*cardsale ; 
		double price = movie -moviesale;
		price = ((int)price / 100)*100;
		
		System.out.println((int)price);
		
	}

}
