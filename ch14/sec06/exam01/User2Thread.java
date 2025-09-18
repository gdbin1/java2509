package ch14.sec06.exam01;

public class User2Thread extends Thread{
	private Calculator calculator;
	
	public User2Thread() {
//		스레드 이름 변경
		setName("User2Thread");
	}
//	외부에서 공유 객체인 Calculator를 받아 필드에 저장
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
//		동기화 블록을 가진 메소드 호출
		calculator.setMemory2(50);
	}
	
//	위 코드는 Calculator를 공유해서 사용하는 User1Thread와 User2Thread를 보여줌.
//	User2Thread는 매개값 50으로 setMemory2()를 호출함.
}
