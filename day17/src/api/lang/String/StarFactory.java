package api.lang.String;

public class StarFactory {

	public static String generateStar(int size) {
		String str = "";
		for(int i=0; i < size; i++) {
			str += "*";
		}
		return str;
	}
	
}