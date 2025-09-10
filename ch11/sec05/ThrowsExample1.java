package ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
//	메소드 내부에서 예외가 발생할 때 try-catch 블록으로 예외를 처리하는게 기본이지만,
//	메소드를 호출한 곳으로 예외를 떠넘길 수도 있음. 이때 사용하는 키워드가 throws임.
//	throws는 메소드 선언부 끝에 작성하는데, 떠넘길 예외 클래스를 쉼표로 구분해서 나열해 주면 됨.
//	ex) 리턴타입 메소드명(매개변수, ~~) throws 예외클래스1, 예외클래스2, ~~ {}
	
//	throws 키워드가 붙은 메소드에서 해당 예외 처리를 하지않고 떠넘겼기 때문에 이 메소드를 호출하는 곳에서 예외를 받아 처리해야 함.
//	위 코드는 ClassNotFoundException을 throws 하는 findClass()의 예외를 위 try은 (호출 한 곳)에서 예외 처리를 받음.
}
