package ch08.sec05;

import ch08.sec04.*;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		인터페이스 변수 선언
		RemoteControl rc;
		
//		Television 객체를 생성하고 인터페이스 변수에 대입 - 구현 객체 타입
		rc= new Television();
		rc.turnOn();
		rc.setVolume(5);
		
//		디폴드 메소드 호출
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
	}
//	위에서 Television 객체를 생성하고 인터페이스에 대입했는데, ch08.sec05 패키지에선 Television에 대한 메소드나, 클래스가 없어서 오류가 뜸. --> 교재가 이상함
//	이걸 해결하는 방법은 1.-- ch08.sec04에 있는 Television의 클래스를 일단 import 해와야함.
//	근데 ch08.sec04에 있는 Television클래스는 ch08.sec04 RemoteControl 인터페이스 클래스의 자식으로 implements를 쓴 걸 볼수있음.
//	그렇기때문에, Television클래스의 내용을 가져오려면, public class Television implements RemoteControl, ch08.sec05.RemoteControl 이렇게 implements 뒤에
//	ch08.sec05의 RemoteControl의 클래스를 달아주면 됨
	
//	디폴트 메소드는 구현 객체가 필요함. 그러므로 위처럼 RemoteControl의 setMute() 메소드를 호출하려면 구현 객체인 ch08.sec04에 있는 Television 객체를 위처럼 인터페이스 변수에 대입하고나서
//	set Mute()를 호출해야 함.  Audio클래스에서 디폴트 메소드 재정의 설명
}
