package ch08.sec04;

public class Audio implements RemoteControl, ch08.sec06.RemoteControl {

		// TODO Auto-generated method stub
//		필드
		private int volume;
		
//		turnOn() 추상 메소드 오버라이딩
		@Override
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
		}
		
//		turnOff() 추상 메소드 오버라이딩
		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
		}
		
//		setVolume() 추상 메소드 오버라이딩
		@Override
		public void setVolume(int volume) {
			if( volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if ( volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}}
//		구현 클래스에서 추상 메소드를 재정의할 때 *주의*해야할 점은 인터페이스의 추상 메소드는 기본적으로 public 접근 제한을 갖기 때문에,
//		public 보다 더 낮은 접근 제한으로 재정의할 수 없음. 그래서 재정의되는 메소드에는 모두 public이 추가되어 있음.

