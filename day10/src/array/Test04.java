package array;
import java.util.Random;
public class Test04 {
	public static void main(String[] args) {
		
		//배열 변수가 줄줄이 모여 있는것
		
		Random r= new Random();
		
		//배열 생성 ... 여러개라고 생각하지만 실제로는 3개 3칸의 변수를 합쳐서 사용...
		int n =20;
		int[] d =new int[n];   //int 를 3개만들어서 - > d로 부르겟다.  위치정보로 호출한다.. d의 몇번째  d[0]
		
		
		for(int i = 0; i <n; i++) {
			d[i] = r.nextInt(6)+1;
		}
		
		
		for(int i =0 ; i<n; i++) {
		System.out.println(d[i]);
		}   //(0~2)
	
		//주사위를 오천번 던지고 싶다면 ....
		//3개니까 3개??? 묶어서 가상으로 여러개를 만들어버린다... 추상화 .. 
		//여러개? -애매함 (추상적)
		//배열은 여러개를 저장하는 저장소 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
