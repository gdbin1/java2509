package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable{
	
	
//	RemoteControl 인터페이스 클래스에 있는 메소드 구현
//	turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
//	turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	
	
//	Searchable 인터페이스 클래스에 있는 search 메소드 구현
//	Search() 추상 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
//	구현 객체는 여러개의 인터페이스를 implements 할 수 있음. 이 클래스에서는 현재 RemoteControl 인터페이스 클래스와, Searchable 인터페이스 클래스 총 2개를 implements함.
//	단, 복수의 인터페이스를 구현하는 클래스를 만들땐 ,(콤마)로 구분해야함.
}
