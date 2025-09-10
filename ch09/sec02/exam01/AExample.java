package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A객체 생성
		A a = new A();
		
//		B객체 생성
		A.B b = a.new B();
	}
//	중첩 클래스 - 클래스 내부에 선언한 클래스.

	//	멤버클래스 - 인스턴스멤버클래스 - ex) classA{ class B{~~} }  <-- A객체를 생성해야만 B객체를 생성할 수 있음
//			- 정적 멤버클래스 - ex) classA { static class B {~~} } <-- A객체를 생성하지 않아도 B객체를 생성할 수 있음.
	
	//	로컬클래스 - ex) class A { void method() { class B {~~} } } <-- method가 실행할 때만 B객체를 생성할 수 있음.
	
//	접근 제한자에 따른 인스턴스 멤버 클래스
//	public class B {}  <-- 다른 패키지에서 B 클래스 사용가능
//	class B {}  <-- 같은 패키지에서만 B클래스 사용가능
//	private class B {}  <-- A클래스 내부에서만 B클래스를 사용 가능.
	
//	B객체를 A클래스 외부에서 생성하기위해 위 코딩처럼 default 또는 public 접근 제한을 가져야 하고,
//	A객체를 먼저 생성한 다음 B객체를 생성했다.
}
