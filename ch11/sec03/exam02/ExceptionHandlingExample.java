package ch11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "100", "1oo" };

		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array [" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			}
//			상위 예외 클래스는 아래쪽에 작성
			  catch (Exception e) {
				System.out.println("실행에 문제가 있습니다.");
			}
		}
	}
//	처리해야 할 예외 클래스들이 상속 관계에 있을 때는 하위 클래스 catch 블록을 먼저 작성하고, 상위 클래스 catch 블록을 나중에 작성해야 함.
//	예외가 발생하면 catch 블록은 위에서 아래로 검사 대상이 되는데, 하위 예외도 상위 클래스 타입이르모 상위 클래스 catch 블록이 먼저 검사 대상이 되면 안됨.
}
