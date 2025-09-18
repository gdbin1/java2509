package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
	}
//	Calculator를 생성해서 User1Thread와 User2Thread에서 사용하도록 setCalculator() 메소드를 호출하고, 두 스레드를 시작시킴.
//	정확히 User1Thread는 100, User2Thread는 50이 출력됨.
//	User1Thread는 Calculator의 동기화 메소드인 setMemory1()을 실행하는 순간 Calculator 객체를 잠금.
//	그렇기때문에 User2Thread는 객체가 잠금 해제될 때까지 Calculator의 동기화 블록을 실행하지못함.
//	2초 일시정지 후에 잠금이 해제되면 User2Thread가 동기화 블록을 실행함.
}
