package ch08.sec05;

public interface RemoteControl {
	
//	상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	디폴드 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
//			추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
//	인터페이스에는 완전한 실행코드를 가진 디폴트 메소드를 선언할 수 있음. 추상 메소드는 {} 실행부가 없지만, 디폴트 메소드는 실행부가 있음.(위처럼)
//	디폴트 메소드의 실행부에는 상수 필드를 읽거나 추상 메소드를 호출하는 코드를 작성할 수 있음. 
}
