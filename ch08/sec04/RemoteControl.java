package ch08.sec04;

public interface RemoteControl {
	
//	상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	인터페이스 클래스, 메소드 선언. 이제 구현클래스를 만들어서 implements를 적고, 이 인터페이스 클래스에서 선언된 메소드를 구현해야함.
//	인터페이스는 구현 클래스가 재정의해야 하는 public 추상 메소드를 멤버로 가질 수 있음.
//	추상 메소드는 리턴 타입, 메소드명, 매개변수만 기술되고 중괄호{}를 붙이지 않는 메소드를 말함.
//	public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙게 됨.
}
