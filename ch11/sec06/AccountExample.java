package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
//		예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
//		출금하기
//		예외 처리 코드와 함께 withdraw() 메소드 호출
		try {
			account.withdraw(30000);
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			}
	}
//	사용자 정의 예외는 컴파일러가 체크하는 일반 예외로 선언할 수도 있고, 컴파일러가 체크하지 않는 실행 예외로 선언할 수도 있다.
//	통상적으로 일반 예외는 Exception의 자식 클래스로 선언하고, 실행 예외는 RuntimeException의 자식 클래스로 선언함.
}
