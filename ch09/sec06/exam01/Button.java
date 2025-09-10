package ch09.sec06.exam01;

public class Button {
	
//	정적 중첩 인터페이스
//	중첩 인터페이스 선언
	public static interface ClickListner{
//		추상 메소드
		void onClick();
	}
//	-----------------
//	중첩 인터페이스는 클래스의 멤버로 선언된 인터페이스임.
//	중첩 인터페이스는 안드로이드와 같은 UI 프로그램에서 이벤트를 처리할 목적으ㅗ 많이 활용됨. ex)버튼 클릭했을 대, 이벤트를 처리할 객체는 중첩 인터페이스를 구현해서 만듬.
//	중첩 인터페이스는 암시적으로 static이므로 static을 생각해도 항상 A객체 없이 B 인터페이스로 사용할 수 있음.
}
