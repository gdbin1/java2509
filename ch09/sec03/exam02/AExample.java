package ch09.sec03.exam02;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		B객체 생성 및 인스턴스 필드 및 메소드 사용
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		
//		B클래스의 정적 필드 및 메소드 사용
		System.out.println(A.B.field2);
		A.B.method2();
	}
//	정적 멤버 클래스 B내부에는 클래스와 같이 필드, 생성자, 메소드 선언이 올 수 있음.

}
