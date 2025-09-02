package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
//		 {}를 ++1씩 증가 5번 실행
		for(int i = 0; i<5; i++) {
			var1++;
			System.out.println("var1: " + var1);
		}
		System.out.println("--------------");
		
		byte var2 = -125;
		for(int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		}
	}
//	결과에 126 127까진 1씩 증가했지만, 그 다음부터 -128 -127~~이 출력되는 이유는
//	byte의 오버플로우는 127까지 그 다음부터 언더플로우는 -128까지때문에 이걸 반복함
}