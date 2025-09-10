package ch09.sec05.exam02;

public class A {
	
//	A인스턴스 필드
	String field = "A-field";
	
//	A인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
//	인스턴스 멤버 클래스
	class B {
//		B 인스턴스 필드
		String field = "B-field";
		
//		B인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
//		B인스턴스 메소드
		void print() {
//			B객체의 필드와 메소드 사용
			System.out.println(this.field);
			this.method();
			
//			A객체의 필드와 메소드 사용
			System.out.println(A.this.field);
//			바깥 클래스에 접근할떄는 바깥클래스 . this  --> 현재 인스턴스 멤버 클래스인 B에서 바깥 클래스인 A에 접근함.
			A.this.method();
		}
	}
//	A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
