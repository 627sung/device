package api.lang.String;

public class Test07 {
	public static void main(String[] args) {
		
	
	
	String time = "2020-05-14-09:48:32.0";
	System.out.println(time);
	System.out.println(time.substring(0, 10));
	System.out.println(time.substring(11, 16)); //
	System.out.println(time.substring(11));   // n부터 끝까지

	String colors = "빨/주/노/초/파/남/보";   //인간은 슬래쉬 기준으로 알았따.. 슬래쉬 기준으로 문자열을 뽀개라
	colors.split("/");
	
	String[] data= colors.split("/");
	
	System.out.println("색상개수 : "+ data.length);
	

	for(int i =0; i<data.length; i++){
		System.out.print(data[i]);
	}
	
	
	}
}
