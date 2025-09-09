package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
	}
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
	}
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
	}
//	자식 인터페이스의 구현 클래스는 자식 인터페이스의 메소드뿐만 아니라, 부모 인터페이스의 모든 추상 메소드를 재정의 해야 함.
//	InterfaceC 클래스를 인터페이스 클래스로만들고 InterfaceA와 InterfaceB를 상속받았다.
//	이 클래스 (InterfaceCImpl)는 InterfaceC를 상속받았는데, 위에 문장처럼 InterfaceC는 InterfaceA와 InterfaceB를 상속받았기 때문에, 모든 추상 메소드를 재정의한것이다.]
//	구현 객체가 자식 인터페이스 변수에 대입되면 자식 및 부모 인터페이스의 추상메소드를 모두 호출 가능하나, 부모 인터페이스 변수에 대입되면
//	부모 인터페이스에 선언된 추상 메소드만 호출가능하다.
}
