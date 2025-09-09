package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		rc 변수에 Television 객체를 대입
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		
//		rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
//	인터페이스 선언 방법은 class 대신 interface 클릭하면 됨. 혹은 class자리에 interface를 적으면 됨.
//	추상 클래스는 자식이 상속받고, 하나의 자식만 쓸수있지만, 인터페이스는 인터페이스로 지정한 클래스에 하나의 큰 틀을잡고, 나머지 자식들이 그거에 대한걸 implements를 써서 무조건
//	메소드를 작성하게 만듬, 강제적인거임 예를들면 추상클래스에선 부모에게 상속받고, 선택적으로 작성할 수 있지만, 인터페이스에 지정한 메소드를 자식이 작성하지 않으면, 오류가 발생함
//	무조건임 무조건 강제적인거임. RemoteControl클래스를 인터페이스로, 메소드를 만들고, Television클래스에서 implements를쓰고, 인터페이스에 선언된 turnOn()의 메소드를 재정의함.
//	만약 이때 Television에서 implements 했지만, TurnOn()에 대한 메소드를 재정의하지 않으면, 오류가 발생함 -> 강제적인거기때문 무조건 인터페이스에 선언된 메소드를 재정의해라.
	
//	Audio 클래스에도 RemoteControl 클래스의 인터페이스를 implements(시행하다) 받고, turnOn() 메소드를 재정의함.
	
}
