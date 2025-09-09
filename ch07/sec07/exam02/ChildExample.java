package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		자식 객체 생성
		Child child = new Child();
		
//		자동 타입 변환
		Parent parent = child;
		
//		메소드 호출
		parent.method1();
		parent.method2();
		
//		parent.method3()  호출 불가능
	}
//	부모 타입으로 자동 타입 변환된 이후엔, 부모 클래스에 선언된 필드와 메소드만 접근이 가능함.
//	변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정됨.
//	그러나 자식 클래스에서 오버라이딩된 메소드가 있다면, 부모 메소드 대신 오버라이딩된 메소드가 호출됨.
//	Chile 클래스에서 메소드 오버라이딩을 했기 때문임
}
