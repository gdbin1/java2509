package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();
		
//		디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
//		정적 메소드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}
//	 인터페이스의 상수필드, 추상메소드, 디폴트메소드, 정적메소드는 모두 public 접근 제한을 가짐.
//	얘네는 선언할 때 public를 생략하더라도 컴파일 과정에서 public접근 제한자가 붙어서 항상 외부에서 접근이 가능함,
//	또한 인터페이스에선 private 접근 제한자 메소드도 선언 가능함.
	
//	private메소드는 디폴트 메소드 안에서만 호출이 가능하지만, private 정적 메소드는 디폴트 메소드 뿐 아니라, 정적 메소드 안에서도 호출 가능함.
//	private 메소드의 용도는 디폴트와 정적 메소드드들의 중복 코드를 줄이기 위함임.
}
