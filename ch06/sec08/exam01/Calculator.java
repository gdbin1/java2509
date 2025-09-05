package ch06.sec08.exam01;

public class Calculator {
	
//	리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
//	리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
//	호출 시 두 정수 값을 전달받고, 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
//		리턴값 지정
		return result;
	}
	
//	호출 시 두 정수 값을 전달받고, 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide (int x , int y) {
		double result = (double)x / (double)y;
//		리턴값 지정
		return result;
	}
//	리턴 타입은 메소드가 실행한 후 호출한 곳으로 전달하는 결과값의 타입을 말함. 리턴값이 없는 메소드는 void로 작성 -> 이 class의 위쪽 코딩
//	메소드명은 소문자로시작, 캐멀스타일로 작성.
	
//	매개변수는 메소드를 호출할 때 전달한 매개값을 받기 위해 사용됨, ex) 이 class의 세번째, 네번째 int와 double 메소드는
//	연산할 두 수 (x), (y)를 전달받아야 하기 때문에, 매개변수2개가 필요함. 전달할 매개값이 없다면 매개변수는 생략 가능. 
}
