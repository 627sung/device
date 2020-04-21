package basic;

public class Test09_1 {

		public static void main(String[] args){
			//준비 : 이용시간
			int billHour = 3 , billMin=35;
			int price = 1000;
			int term = 30;
			//계산 이용시간 분 
			int billTime = (billHour*60 +billMin);
			int totalprice = (billTime/term)*price + price;
			
			//출력
			System.out.println(totalprice);

	}

}
