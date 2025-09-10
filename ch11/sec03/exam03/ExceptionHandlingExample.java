package ch11.sec03.exam03;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"100", "1oo", null, "200"};
		
		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] : " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch (NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
		}
	}
//	두개 이상의 예외를 하나의 catch 블록으로 동일하게 예외 처리 하고 싶을떄는
//	catch 블록에 예외 클래스 기호 | 로 위처럼 연결하면 됨.

}
