// 같은 패키지
package ch07.sec06.package1;

public class B {
	
//	메소드 선언
	public void method() {
//		가능
		A a = new A();
//		가능
		a.field = "value";
//		가능
		a.method();
	}
//	protected는 같은 패키지에서는 default처럼 접근이 가능하지만, 다른 패키지에서는 자식 클래스만 접근흘 허용함.
//	protected는 필드와 생성자, 그리고 메소드 선언에 사용될 수 있음.
//	B클래스는 A클래스와 같은 패키지에 있기 때문에, A의 protected 필드, 생성자, 메소드에 접근이 가능함.
}
