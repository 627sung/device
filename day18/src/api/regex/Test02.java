package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디, 비밀번호를 입력하세요");
		String id = sc.nextLine();
		String password = sc.nextLine();
		sc.close();
		
//		String idRegex = "^[abcdefghijklmnopqrstuvwxyz0123456789\\-_]{5,20}$";
//		String idRegex = "^[a-z0-9\\-_]{5,20}$";
		String idRegex = "^[a-z\\d\\-_]{5,20}$";
//		String passwordRegex = "^[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\-_]{8,16}$";
//		String passwordRegex = "^[a-zA-Z0-9\\-_]{8,16}$";
		String passwordRegex = "^\\w{8,16}$";
		
//		if(아이디가 형식에 맞다면) {
		if(Pattern.matches(idRegex, id)) {
			System.out.println("아이디가 올바른 형식입니다");
		}
		else {
			System.out.println("아이디는 5~20자 이내의 영문소문자, 숫자, -, _로 작성하세요");
		}
		
//		if(비밀번호가 형식에 맞다면) {
		if(Pattern.matches(passwordRegex, password)) {
			System.out.println("비밀번호가 올바른 형식입니다");
		}
		else {
			System.out.println("비밀번호는 8~16자 이내의 영문, 숫자, -, _로 작성하세요");
		}
	}
}