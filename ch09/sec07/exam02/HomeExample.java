package ch09.sec07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Home 객체 생성
		Home home = new Home();
		
//		익명 구현 객체가 대입된 필드 사용
		home.use1();
		
//		익명 구현 객체가 대입된 로컬 변수 사용
		home.use2();
		
//		익명 구현 객체가 대입된 매개변수 사용
		home.use3(new RemoteControl(){
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
			}
		});
	}
//	ch09.sec07.exam02패키지에 있는 클래스들은 익명 객체를 인터페이스를 구현해서 생성한것이다. 인터페이스를 구현해서 만들었기 때문에 - 익명 구현 객체라고 부른다.
//	익명 구현 개체는 인터페이스를 구현해서 생성되고, 이 익명 구현 객체는 인터페이스 타입의 필드, 로컬변수, 매개변수 값으로 대입할 수 있다.
//	ex) new 인터페이스() { 필드 , 메소드 } 중괄호 블록 안의 필드와 메소드는 익명 구현 객체가 가져야 할 멤버로, 중괄호 블록 안에서만 사용 가능하다.
//	이유는 익명 구현 객체는 인터페이스 타입에 대입되므로 인터페이스 타입에 선언된 멤버만 접근할 수 있기 때문이다.중괄호 블록안엔 주로 인터페이스의 추상 메소드를
//	재정의하는 코드가 온다.
	
}
