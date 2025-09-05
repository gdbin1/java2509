package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
//	클래스가 메모리로 로딩되면 정적 멤버를 바로 사용 가능한데, 위처럼 클래스 이름과 함께 도트(.) 연산자로 접근하면 됨.
}
