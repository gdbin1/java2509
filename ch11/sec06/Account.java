package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	
//									아래있는 놈이 사용자 정의 예외발생시켜서 이쪽 throws InsufficientException로 예외 떠넘김 
	public void withdraw(int money) throws InsufficientException{
		if(balance < money) {
			
//			아래 코드 사용자 정의로 예외 발생 - throw - 호출한 곳으로 떠넘겨버리기
			throw new InsufficientException("잔고 부족: "+(money-balance)+" 모자람");
		}
		balance -= money;
	}
	
//	자바에서 제공하는 표준 예외뿐 아니라, 사용자 정의 예외르 직접 코드에서 발생시키려면 throw 키워드와 함께 예외 객체를 제공하면 된다.
	
//	throw된 예외는 직접 try-catch 블록으로 예외를 처리할 수도 있지만, 대부분은 메소드를 호출한 곳으로 예외를 처리하도록
//	throws 키워드로 예외를 떠넘긴다.
}
