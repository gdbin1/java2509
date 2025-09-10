package ch09.sec03.exam01;

public class A {

//	정적 멤버 클래스
	static class B{}
	
//	인스턴스 필드값으로 B객체 대입
	B field1 = new B();
	
//	정적 필드값으로 B객체 대입
	static B field2 = new B();
	
//	생성자
	A() {
		B b = new B();
	}
	
//	인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
//	정적 메소드
	static void method2() {
		B b = new B();
	}
//	정적 멤버 클래스 B는 A클래스 내부에서 사용되기도 하지만, A클래스 외부에서 A와 함께 사용하는 경우가 많기 때문에
//	주로 default 또는 public 접근 제한을 가짐. *B객체는 A클래스 내부 어디든 객체 생성이 가능함.*
}
