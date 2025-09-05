package ch06.sec13.exam03.package1;

public class A {

//	public 접근 제한을 갖는 필드 선언
	public int field1;
//	default 접근 제한을 갖는 필드 선언
	int field2;
//	private 접근 제한을 갖는 필드 선언
	private int field3;
	
//	생성자 선언
	public A() {
//		---------
//		클래스 내부일 경우 접근 제한자의 영향을 받지 않음. 아래 다 가능
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
//		----------
	}
	
//	public 접근 제한을 갖는 메소드 선언
	public void method1() {}
	
//	default 접근 제한을 갖는 메소드 선언
	void method2() {}
	
//	private 접근 제한을 갖는 메소드 선언
	private void method3() {}
	
//	필드와 메소드의 접근 제한- 필드와 메소드도 어디서나 읽고 호출할 수 있는게 아니라, 어떤 접근 제한을 갖느냐에따라 호출 여부가 결정됨.
//	필드와 메소드는 public, default, private 접근 제한을 가질 수 있음.
	
//	접근 제한자			필드와 메소드			설명
//	public				필드 메소드()			모든 패키지에서 필드를 읽고 변경가능, 모든 패키지에서 메소드 호출 가능
//						필드 메소드()			같은 패키지에서만 필드를 읽고 변경 가능, 같은 패지키에서만 메소드 호출 가능
//	private				필드 메소드()			클래스 내부에서만 필드를 읽고 변경 가능, 클래스 내부에서만 메소드를 호출 가능
}
