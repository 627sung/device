package basic;

public class Test10_T {

	public static void main(String[] args) {
	

			//준비
			
			int	inHour =10, inMin = 45;    //입장한 시간
			int outHour = 17, outMin = 20; //나간 시간
			int price = 500;  			 //가격	
			
			
			//계산
			int inTime = (inHour*60 + inMin );    //들어온시간
			int outTime = (outHour*60+outMin) ;    //나간시간
			int parkingTime = (outTime-inTime);    
    		int totalPrice  = (parkingTime/10) *price;
			//출력
			System.out.println(totalPrice);
				
			}
	

	}


