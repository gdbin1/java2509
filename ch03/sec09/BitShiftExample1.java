package ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int result1 = num1 << 3;
//		Math.pow(2, 3)은 2의 3제곱을 연산하고, double 값을 산출함. int값을 얻고 싶다면 (int)로 캐스팅해야함.
		int result2 = num1 * (int)Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
//		결과 해석: num1변수의 값은 1로지정 1 * 2의3제곱-8 = 1 * 8 = 8
		
		int num2 = -8;
		int result3 = num2 >> 3;
//		Math.pow(2, 3)은 2의 3제곱을 연산하고, double 값을 반환함 나숫셈을 위해 정수값을 반환하려면 (int)로 캐스팅
		int result4 = num2 / (int)Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
//		결과해석: num2의 변수의 값은 -8로 지정, -8 / 2의3제곱-8 = -8 / 8 = 1
		
//		비트 이동 연산자
//		이동(shift)
//		연산식 a << b = 정수 a의 각 비트를 b만큼 왼쪽으로 이동 , 오른쪽 빈자리는 0으로 채움, a x 2의b제곱과 동일한 결과가 됨
//		연산식 a >> b = 정수 a의 각 비트를 b만큼 오른쪽으로 이동, 왼쪽 빈자리는 최상위 부호 비트와 같은 값으로 채움 a / 2의b제곱과 동일한 결과가 됨
//		연산식 a >>> b = 정수 a의 각 비트를 b만큼 오른쪽으로, 이동 왼쪽 빈자리는 0으로 채움
//		ex) 1 << 3 = 1 x 2의3제곱 = 8
	}

}
