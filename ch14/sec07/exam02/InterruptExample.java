package ch14.sec07.exam02;

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
//		interrupt 메소드 호출
		thread.interrupt();
	} 
//	interrupt() 메소드는 스레드가 일시 정지 상태에 있을 때 InterruptedException 예외를 발생시키는 역할을 함.
//	이것을 ㅣㅇ용하면 예외 처리를 통해 run() 메소드를 정상 종료 시킬 수 있음.
}
