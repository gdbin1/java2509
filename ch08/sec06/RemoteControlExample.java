package ch08.sec06;

import ch08.sec04.Audio;


public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		인터페이스 변수 선언
		RemoteControl rc;
		
//		Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
//		디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
//		Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
//		디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
//		정적 메소드 호출
		RemoteControl.changeBattery();
	}
//	RemoteControl 인터페이스 클래스에서 정적 메소드를 선언했고, 주석으로 적어놓은 호출 방법과 동일하게 호출함.
//	ch08.sec04의 television을 import 하려했는데, 그러면 ch08.sec05의 RemoteControlExmaple과 이 클래스 모두 boolean을 쓰므로 자바는 어떤걸 사용할지 몰라서 오류 발생함
//	그래서 그냥 이 패키지에도 Television 클래스를 만들어서 television을 거기에 연결하고, Audio를 ch08.sec04.Audio클래스를 임포트해서 연결함
	
	
}
