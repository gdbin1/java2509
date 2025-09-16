package ch12.sec07;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		큰 정수 또는 작은 정수 얻기
		double v1 = Math.ceil(5.3);
		double v2 = Math.floor(5.3);
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		
//		큰값 또는 작은값 얻기
		long v3 = Math.max(3, 7);
		long v4 = Math.min(3, 7);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		
//		소수 이하 두 자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v5 = temp2 / 100.0;
		System.out.println("v5=" + v5);
	}
//	Math클래스는 수학 계산에 사용할 수 있는 메소드를 제공하고, Math클래스가 제공하는 메소드는 모두 정적(static)이므로 Math클래스로 바로 사용이 가능함.
//	Math클래스가 제공하는 메소드는 이것이자바다 3판 2권 531pg에 있음.
}
