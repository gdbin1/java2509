// A클래스와 다른 패키지
package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
//	-----상속을 통해서만 가능---------
	
//	가능
//	생성자 선언
	public D() {
//		생성자 호출
		super();
	}
	
//	가능
//	메소드 선언
	public void method1() {
//		A필드값 변경
		this.field = "value";
//		A메소드 호출
		this.method();
	}
	
//	불가능 -----직접 객체생성해서 사용하는건 안됨 ---------
//	메소드 선언
//	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method();
//	}
	
//	D클래스는 A클래스와 패키지가 다르지만 A클래스의 자식이므로 super()를 이용해서 , A의 protected 필드, 생성자, 메소드에 접근이 가능하다.
//	하지만, new 연산자를 사용해서 생성자를 직접 호출할 수 없음.
}
