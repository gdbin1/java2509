package ch14.sec07.exam03;


public class InterruptedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		thread.interrupt();
	}
//	스레드가 실행 대기/ 실행 상태일떈 interrupt()메소드가 호출되어도 InterruptedException이 발생하지 않음.
//	그러나 스레드가 어떤 이유로 일시 정지 상태가 되면, InterruptedException예외가 발생함. 그래서 짧은 시간이나마 일시 정지를 위해 sleep(1)을 준것임.
//	일시 정지를 만들지 않고도 interrupt() 메소드 호출 여부를 아는 방법은,
//	Thread의 interrupted()와 isInterrupted()메소드는 interrupe() 메소드 호출 여부를 리턴함.
//	interrupted()는 정적 메소드이고, inInterrpted()는 인스턴스 메소드임
	
//	이 패키지의 두 클래스는 Tread.sleep(1) 대신, Thread.interrupted()를 사용해서 interrupe()메소드가 호출되었는지 확인하고, while 문을 빠져나가도록 한것임.
}
