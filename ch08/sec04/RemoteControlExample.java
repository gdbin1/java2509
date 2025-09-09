package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		인터페이스 변수 선언
		RemoteControl rc;
		
//		Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
//		Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
//	인터페이스로 구현 객체를 사용하려면, 인터페이스 변수를 선언하고 구현 객체를 대입해야함. 인터페이스는 변수는 참조타입이라, 구현 객체가 대입되면 구현 객채의 번지를 저장해야함.
//	ex) RemoteControl rc; rc = new Television(); / RemoteControl rc = new Audio();
//	구현 객체가 대입되면 인터페이스 변수로 추상 메소드를 호출 할 수 있음.
//	이때 어떤 ㅜㄱ현 객체가 대입 되었는지에 따라 위처럼 실행 내용이 달라짐. Television과 Audio
}
