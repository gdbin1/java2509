package ch08.sec04;

public class Television implements RemoteControl,ch08.sec05.RemoteControl {

//	필드
	private int volume;
	
//	turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
//	turnOff() 추상 메소드 오버라이딩
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
//	setVolume() 추상 메소드 오버라이딩
//	인터페이스 상수 필드를 이용해서 volume 필드의 값을 제한. RemoteControl 인터페이스 클래스에서 맥스볼륨=10 민볼륨=0으로 상수로 적음.
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
