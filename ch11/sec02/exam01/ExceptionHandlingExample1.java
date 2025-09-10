package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
//		data가 null일 경우 NullPointerException 발생
		int result = data.length();
		System.out.println("문자 수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
		
//		컴퓨터 하드웨어의 고장으로 인해 응용프로그램 실행 오류가 발생하는것을 자바에선 에러라고 함.
//		자바에서는 에러 이외에 예외 라고 부르는 오류가 있음. 예외란 잘못된 코딩으로 인한 오류를 말함.
//		예외가 발생하면(잘못된 코딩으로 인한 오류) 프로그램은 곧바로 종료된다는건 에러와 동일하지만,
//		예외 처리를 통해 계속 실행 상태를 유지할 수 있음.
		
//		예외의 종류 - 일반 예외(Exception) - 컴파일러가 예외 처리 코드 여부를 검사하는 예외임.
//				 - 실행 예외(Runtime Exception) - 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외임.
		
//		자바의 모든 에러와 예의 클래스는 Throwable을 상속받아 만들어지고, 추가적으로 예외 클래스는 java.lang.Exception 클래스를 상속받음.
		
//		예외 처리 코드는 try-catch-finally 블록으로 구성됨. try{}   catch(예외클래스 e){}   finally{ 항상 실행 }
//		try블록의 작성코드가 예외없이 실행되면 catch블록을 건너뛰고 finally 실행 / try블록에서 에외가 발생하면 catch블록 실행하고 finally 실행
		
//		13라인에서 null을 넣었기때문에, NullPointerException이 발생함. NullPointerException은 참조변수가 null인상태에서 필드나 메소드에 접근할 경우 발생함.
//		NullPointerException은 실행 예외라서 컴파일할 때 예외 처리 코드가 없어도 되지만, 실행 중에 발생하면 프로그램은 즉시 종료함.
	}
}
