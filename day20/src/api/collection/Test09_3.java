package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test09_3 {
	public static void main(String[] args) {
//		1. 한자리의 랜덤글자를 생성
//		2. 1번을 10번 반복하여 합성
//		3. 합성된 결과를 화면에 출력
		
//		String password = "1V2cTug89k";
		
//		만약 알파벳 소문자만 뽑으라고 한다면 90 ~ 122 까지 랜덤값을 뽑으면 된다.
//		지금은 범위가 떨어져 있기 때문에 붙어있는 값을 추첨할 수 없다.
//		추첨해야될 글자들을 전부다 List에 추가한 뒤 무작위로 추첨
		
		List<String> list = new ArrayList<>();
		
//		list에 숫자와 알파벳 소문자, 대문자를 추가(10+26+26=62번)
		for(char i='a'; i <= 'z'; i++) {
			list.add(String.valueOf(i));
		}
		
		for(char i='A'; i <= 'Z'; i++) {
			list.add(String.valueOf(i));
		}
		
		for(char i='0'; i <= '9'; i++) {
			list.add(String.valueOf(i));
		}
		
//		System.out.println(list);
		
//		무작위로 list에서 하나의 값을 추첨한다면...
		Random r = new Random();
//		int index = 0부터 size-1까지;
		
//		String password = "";
		StringBuilder builder = new StringBuilder();
		for(int i=0; i < 10; i++) {
			int index = r.nextInt(list.size());
//			password += list.get(index);
			builder.append(list.get(index));
		}
		
		String password = builder.toString();
		System.out.println(password);
		
	}
}







