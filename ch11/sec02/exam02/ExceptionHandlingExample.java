package ch11.sec02.exam02;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		try {
//			ClassNotFoundException 발생 가능 코드
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
//	첫번쨰 try문이 예외가없어서 정상실행되어 java.lang.String 클래스가 존재합니다. 라는 결과를 출력하는 이유는
//	자바엔 java.lang.String는 자바의 기본 클래스중 하나로 자바 자체에 존재한다. 그렇기때문에, 오류 없이 결과를 출력해내고,
//	두번쨰 try문이 오류코드가 나오는 이유는 java.lang.String2라는 이름의 클래스는 자바에 존재하지 않는 클래스기때문에 예외를 발생시켜서
//	try문을 중단하고, catch문으로 넘어가서 catch문에 있는 e.printStackTrace()를 실행한것이다.
//	e.printStackTrace()는 예외가 발생했을시에, 해당 예외에 대한 상세 정보를 콘솔에 출력하는 코드임.
}
