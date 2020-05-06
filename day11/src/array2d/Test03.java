package array2d;

public class Test03 {

	public static void main(String[] args) {
		//정보저장하기 
	//1반{50,75,90,40,80}
	//2반{66,70,55,85,70}
	//3반{50,50,80,90,95}
//1.반 배열만들고 출력
//2.평균 구해서 출력
//3.72 점인 학생의 전체석차를 구하여서 출력
	
		//성적정보 저장
	int [][]s = new int[][] {
		{50,75,90,40,80},
		{66,70,55,85,70},
		{50,50,80,90,95}
	};
	
	//출력
	System.out.println("입력한 데이터의 출력");
	for(int i =0; i<s.length;i++) {
		for(int j =0; j <s[i].length;j++) {
			System.out.print(s[i][j]);
			System.out.print("\t");
		}
		System.out.print("\n");
	}
	
	//각각의 반의 평균을 구하여 출력하기 
	//평균은 합계 /개수
	//첫번째 반의 합계 .
	int total1=0;
	for(int i=0; i<s[0].length; i++) {
		total1+=s[0][i];
	}
	
	
	
	double  avg1= (double)total1/s[0].length;
	System.out.println(avg1);
	int total2=0;
	
	for(int i=0; i<s[1].length; i++) {
		total2+=s[0][i];
	}
	double  avg2= (double)total2/s[0].length;
	System.out.println(avg2);

	
	
	
	
	//성적 평균 구하기
	System.out.println("성적의 평균 구하기");
	int realtotal=0;	
	for(int j =0; j < s.length; j++) {
		int total = 0;
		for(int i =j; i<s[j].length ;i++) {
				total+= s[j][i];

	    	}

		}

	}
}