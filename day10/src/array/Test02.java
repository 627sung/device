package array;
import java.util.Random;
public class Test02 {
	public static void main(String[] args) {
		
		//배열 변수가 줄줄이 모여 있는것
		
		Random r= new Random();
		
		//배열 생성 ... 여러개라고 생각하지만 실제로는 3개 3칸의 변수를 합쳐서 사용...
		int[] d =new int[3];   //int 를 3개만들어서 - > d로 부르겟다.  위치정보로 호출한다.. d의 몇번째  d[0]
		
		
		d[0] = r.nextInt(6)+1;    //[0] 자리에 식이나 변수가 들어갈수가 있다.  계산이 가능하다.  x3(0~2)
		d[1] = r.nextInt(6)+1;
		d[2] = r.nextInt(6)+1;

		
		
		System.out.println(d[0]);   //(0~2)
		System.out.println(d[1]);
		System.out.println(d[2]);

		//주사위를 오천번 던지고 싶다면 ....
		//3개니까 3개??? 묶어서 가상으로 여러개를 만들어버린다... 추상화 .. 
		//여러개? -애매함 (추상적)
		//배열은 여러개를 저장하는 저장소 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
