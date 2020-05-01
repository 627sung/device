package array;

import java.util.Random;

public class Test11 {

	public static void main(String[] args) {
		String[] lang = new String[] { "자바", "자바스크립트", "파이썬", "루비", " C#",  };


		int j = lang.length;

		for (int i = 0; i < lang.length / 2; i++) {

			j--;
			String tmp = lang[j];
			lang[j] = lang[i];
			lang[i] = tmp;

		}

		for (int i = 0; i < lang.length; i++) {
			System.out.println(lang[i]);
		}

	}

}