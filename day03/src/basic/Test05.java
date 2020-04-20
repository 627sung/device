package basic;
import java. lang. *;
public class Test05 {
	public static void main (String[] args) {
		/*소주 (4000원)  : 20병
		 *맥주 (5000원)  : 15병 
		 *  회식 인원은 7명일시 전체 금액과 1인당 얼마인지 출력하라 */
		
		int sojuPrice = 4000;   //소주 병당 4000원
		int beerPrice = 5000;   //맥주 병당 5000원 
		int sojuBottle = 20;
		int beerBottle = 15;
		int member = 7 ;   //참여인원 7명
		
		//계산
		int totalPrice = (sojuPrice*sojuBottle)+(beerPrice*beerBottle);  //총 계산금액
	    int personPrice = totalPrice/member;
		
		//출력
		System.out.println(totalPrice);		 
		System.out.println(personPrice); // 각자의 부담금액
 		
	}

}
