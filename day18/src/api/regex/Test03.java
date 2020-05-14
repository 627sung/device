package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		
		String name ="문재인";
		String nameregex="^[가-힣]{2,7}$";
		
		String birth = "1960-05-07";
		String birthregex ="^(19|20)[0-9][0-9]-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|[3][0-1])$";
		
		System.out.println(Pattern.matches(nameregex,  name));
		System.out.println(Pattern.matches(birthregex,  birth));

		
		
}
}