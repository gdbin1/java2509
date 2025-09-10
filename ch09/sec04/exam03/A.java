package ch09.sec04.exam03;

public class A {
	
//	메소드
//	final int arg
	public void method1(int arg) {
//		로컬 변수
//		final int var = 1;
		int var = 1;
		
//		로컬 클래스
		class B {
//			메소드
			void method2() {
//				로컬 변수 읽기 - 가능
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				
//				로컬 변수 수정 - 불가능
//				arg = 2;
//				var = 2;
			}
		}
		
//		로컬 객체 생성
		B b = new B();
//		로컬 객체 메소드 호출
		b.method2();
		
//		로컬 변수 수정 - 불가능
//		arg = 3;
//		var = 3;
	}
//	로컬 변수(생성자 또는 메소드의 매개변수 또는 내부에서 선언된 변수)를 로컬 클래스에서 사용할 경우 로컬 변수는 final 특성을 갖게 되어서
//	값을 읽을 수만 있고, 수정할 수 없게 됨.
//	자바 8 이후부턴 명시적으로 final 키워드를 안붙여도되지만, 로컬 변수에 final 키워드를 추가해서 final 변수임을 명확히 할 수도 있음. -자바7 이전까진 final 붙여야됐음-
}
