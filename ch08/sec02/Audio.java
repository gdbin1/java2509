package ch08.sec02;

public class Audio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
//	RemoteControl에 인터페이스 지정한걸 implements를 작성후, trunOn() 메소드 재정의.
}
