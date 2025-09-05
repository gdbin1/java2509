package ch06.sec08.exam02;

public class Computer {
	
//	가변길이 매개변수를 갖는 메소드 선언
	int sum(int ... values) {
//		sum 변수 선언
		int sum = 0;
		
//		values는 배열 타입의 변수처럼 사용
		for (int i = 0; i < values.length; i++) {
			sum +=  values[i];
		}
//		합산 결과를 리턴
		return sum;
	}
//	메소드를 호출할 땐, 매개변수의 개수에 맞게 매개값을 제공해야함.
//	만약 메소드가 가변길이 매개변수를 갖고있다면, 매개변수의 개수와 상관없이 매개값을 줄 수 있음.
//	이 class의 맨 위 int sum(int ... values){}가 가변길이 매개변수를 선언한 예시
//	가변길이 매개변수는 메소드 호출 시 매개값을 쉼표로 구분하고, 개수와 상관없이 제공이 가능함.
//	매개값들은 자동으로 배열 항목으로 변환되어 메소드에서 사용됨. 그래서 메소드 호출 시 직접 배열을 매개값으로 제공해도 됨.
}
