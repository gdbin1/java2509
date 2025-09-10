package ch11.sec06;

//	일반 예외는 Exception , 실행 예외는 RuntimeException
//	ex) public class XXXException extends [Exception | RuntimeException] 아래 코딩은 Exception의 자식 클래스 선언 (일반 예외)
public class InsufficientException extends Exception{
	
//	총 두개의 생성자 선언.
//	기본 생성자 
	public InsufficientException() {
		
	}
	
//	예외 메시지를 입력받는 생성자
	public InsufficientException(String message) {
		super(message);
	}
	
//	
}
