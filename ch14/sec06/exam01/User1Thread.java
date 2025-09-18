package ch14.sec06.exam01;

public class User1Thread extends Thread{
	private Calculator calculator;
	
	public User1Thread() {
//		스레드 이름 변경
		setName("User1Thread");
	}
//	외부에서 공유 객체인 Calculatro를 받아 필드에 저장
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
//		동기화 메소드 호출
		calculator.setMemory1(100);
	}
//	위 코드는 Calculator를 공유해서 사용하는 User1Thread와 User2Thread를 보여줌.
//	run() 메소드에서 User1Thread는 매개값 100으로, setMemory1() 메소드를 호출함.
}
