package ch08.sec09;

public interface InterfaceC extends InterfaceA, InterfaceB {
//	추상 메소드
	void methodC();
	
//	interface도 다른 interface를 상속할 수 있으며, 클래스와는 달리 다중 상속이 가능하다.
//	위처럼 extends 키워드 뒤에 상속할 인터페이스들을 나열하면 된다.

}
