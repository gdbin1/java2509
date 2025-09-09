package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		
//		RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
		rc.turnOn();
		rc.turnOff();
		
//		Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = new SmartTelevision();
		
//		Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		searchable.search("https://www.youtube.com");
	}

//	SmartTelevision 클래스에서 두개의 인터페이스 클래스를 구현했고, 출력해냄
//	근데 여기서 궁금한 점 -> 만약 A, B 두개의 클래스에 동일한 메소드명(search)가 있을때는 어떻게 될까 ->
//	-> 메소드를 구현하는 SmartTelevision에서 search메소드를 구현했을시에, A 인터페이스 클래스와 B 인터페이스 메소드의 구현값이 같게 출력됨.
//	-> 만약 A, B의 메소드가 같지만, 다른 결과를 SmartTelevision에서 구현해내고 싶다면? -> 앞에서 학습했던 default 메소드를 사용함
//	ex) A.super.search();		B.super.search();    이렇게 default 메소드를 구현하면, 구현 클래스에서 복수의 인터페이스중, 겹치는 메소드를 구현해야할 때,
//	상황에 따라 서로 다른 구현 메소드를 출력이 가능해짐.
}
