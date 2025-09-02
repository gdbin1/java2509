package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		System.out.println(z + 2);
//		잘못된 코드
		
//		알맞은 코드로 작성하려면
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
// 나눗셈(/) 또는 나머지(%) 연산에서 좌측 피연산자가 정수이고
// 우측 피연산자가 0일경우 예외가 발생함. 무한대의 값을 정수로 표현할 수 없기 때문.
// 때문에 위에 잘못된 코드에서의 값은 5 / 0 이기때문에 결과가 infinity로 출력
// infinity상태에서 계속 연산을 수행하면 어떤 연산을 하더라도 결과가 infinity로됨 (주의)
// ex) infinity + 2 -> 결과=infinity
// ex) NaN + 2 -> 결과 = NaN
	}

}
