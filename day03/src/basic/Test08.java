package basic;
import java.lang.*;
public class Test08 {

	public static void main(String[] args) {
/*어제는 3시간 20분 공부하고, 오늘은 2시간 50분 공부했습니다. 다음을 계산하여 출력하세요
 *  (1) 어제 공부한 시간과 오늘 공부한 시간의 합계 시간 (2) 어제 공부한 시간과 오늘 공부한 시간의 차이
hint : 시간을 계산할 때에는 가장 작은 단위로 변환해서 하시면 편합니다.
출력은 시간과 분을 따로 하세요*/	

		
	
	//변수설정
	int yesterday = 200;
	int today =  170;
	

	//계산
	int studysumtime = (yesterday + today)/60; 
	int syudysummin = (yesterday + today)%60;
	
	int studyminustime =(yesterday - today)/60;  
	int studyminusmin =(yesterday - today)%60; 


	//출력
	System.out.println(studysumtime+"시간"+syudysummin+"분");
	System.out.println(studyminustime+"시간"+studyminusmin+"분");
	

	}
	
	
	
	
	
	
}
