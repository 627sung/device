package Loop;

public class Test07_02T {

	public static void main(String[] args) {
			
			
			int day = 1;
			int pushup = 10 ;
			int total = 0;
			while(day<31) {
			System.out.println(day+"일차 :"+pushup);
			
			total += pushup;    //날짜가 변하기전에 더하기 
			
				day++; //날짜가 변하고 푸쉬업의 수가 증가 	
				pushup +=3;
			}
			
			
			System.out.println(total+"만큼의  푸시업을 합니다.");
		}

	}
