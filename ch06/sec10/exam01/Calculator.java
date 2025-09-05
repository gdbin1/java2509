package ch06.sec10.exam01;

public class Calculator {

	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus (int x, int y) {
		return x - y;
	}
//	자바는 클래스 로더를 이용해서 클래스를 메소드 영역에 저장하고 사용
//	정적 멤버의 뜻은 메소드 영역의 클래스에 고정적으로 위치하는 멤버를 말함. 그래서 정적멤버는 객체를 생성 할 필요 없ㅅ이, 클래스를 통해 바로 사용 가능.
//	필드와 메소드는 모두 정적 멤버가 될 수 있음
//	public class 클래스 {
//	ex) 1. - 정적 필드 선언 = static 타입 필드 [=초기값]
//	ex) 2. - 정적 메소드 static 리턴타입 메소드 (매개변수, 값) {}	}
}
