package basic;
import java.lang. *;
public class Test10_1 {

	public static void main(String[] args) {

	int enter = 10*60+45; 
	int exit = 17*60 +20;
	int parking = exit - enter ;
	int price = 500; 
	int totalprice = (parking/10)*500;
		
		System.out.println(totalprice);
	}

}
