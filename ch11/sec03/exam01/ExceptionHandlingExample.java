package ch11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"100", "1oo"};
		
		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			}
		}
	}
//	try블록에서 다양한 종류의 예외가 발생했을 시엔, 위처럼 다중catch를 사용하면 발생하는 예외에 따라 예외 처리 코드를 다르게 작성할 수 있음.
	
//	위 코드는 배열의 인덱스가 초과되었을 경우 발생하는 ArrayIndexOutOfBoundsException과
//	숫자타입이 나일 떄 발생하는 NumberFormatException을 각각 예외처리한 것이다. 결과 확인
	
//	catch블록이 복수여도, catch 블록은 단 하나만 실행됨. 이유는 try블록에서 동시다발적으로 예외가 발생하지 않으며, 하나의 예외가 발생하면
//	즉시 실행을 멈추고 해당 catch블록으로 이동하기 때문임. 즉-> try에서 제일먼저 예외가 발생하면 바로 try종료하고 해당 catch로 넘어가서 그런듯.
}
