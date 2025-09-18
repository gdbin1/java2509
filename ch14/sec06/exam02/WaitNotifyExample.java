package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
//		공유 작업 객체 생성
		WorkObject workObject = new WorkObject();
		
		
//		작업 스레드 생성 및 실행
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}
//	wait()과 notify()는 두개의 스레드를 교대로 번갈아가며 실행할 떄 사용. ex) 정확한 교대 작업이 필요할 경우.
//	notify()는 wait()에 의해 일시 정지된 스레드 중 한개를 실행 대기 상태로 만들고, notifyAll()은 wait()에 의해 일시 정지된 모든 스레드를 실행 대기 상태로 만듬.
//	------*주의할 점은 이 두 메소드는 동기화 메소드 또는 동기화 블록 내에서만 사용이 가능함.*-------------
	
}
