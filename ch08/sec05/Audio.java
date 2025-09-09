package ch08.sec05;

public class Audio implements RemoteControl{
	
//	필드
	private int volume;
	
//	turnOn()추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
//	turnOff()추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

//	setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
	}
//	필드 (추가 필드 선언)
	private int memoryVolume;
	
//	디폴트 메소드 재정의 ( 추가된 내용 )
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
//			mute가 false일 경우, 원래 볼륨으로 복원하는 코드
			setVolume(this.memoryVolume);
		}
	}
//	구현 클래스는 디폴트 메소드를 재정의해서 나한테 맞게 수정이 가능함.
//	하지만 주의할 점은 *public 접근 제한자를 반드시 붙여야하고, default 키워드를 생략해야 함.*
}
