package input;
import java.io.IOException;
import java. lang. *;
public class Test01 {
	public static void main (String[] args) throws IOException {
		int a = System.in.read(); // 0~255만 읽는다. 한글못읽는다. 아스키코드내에서만 읽기가 가능 
		int b = System.in.read();
		System.out.println(a);
		System.out.println(b);

	}
}
