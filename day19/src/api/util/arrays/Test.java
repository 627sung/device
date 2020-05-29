package api.util.arrays;

public class Test {
	public static void main(String[] args) {
//		인터페이스는 객체 생성 불가(추상클래스도 마찬가지)
//		Teacher t = new Teacher();
		
//		1회용 상속(이 객체에만 적용) - 익명 중첩 클래스(anonymous inner class)
		Teacher t = new Teacher() {
			@Override
			public void teach() {
				System.out.println("강의 기능!");				
			}
		};
		t.teach();
	}
}
