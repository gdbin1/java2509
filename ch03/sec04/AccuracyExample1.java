package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}
//0.1같은 10진수 소수는 2진수로 무한히 반복되는 값으로 표현되기 때문에
//0.2999999999999993 이 결과를 출력함
//그렇기 때문에 double이나 floet같은 부동소수점 타입을 사용한 연산은
//정확한 소수점 계산이 필요한 때에는 부적합함
}
