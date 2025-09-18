package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
//		작업 생성과 처리 요청
//		스레드풀 종료
		executorService.shutdownNow();
	}
	
//	스레드풀은 작업 개수가 맣아질 때 최대 5개까지 스레드를 생성시켜서 작업시킴. 이 클래스의 코딩중 주석으로 스레드풀 생성이라 적은 코드에서 5개 스레드를 생성해서 작업시킨거임.
//	이 메소드를 사용하지않고, ThreadPoolExecutor로 스레드풀을 생성할 수도 있음.
//	ex) ExecutorService threadPool = new ThreadPoolExecutor( 3, 100, 120L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>() );
//	위 예시 코드의 해석 (코어 스레드개수, 최대 스레드개수, 놀고있는 시간, 놀고있는 시간 단위, 작업큐 ) <-- 위 예시코드 순서임
	
//	스레드풀의 스레드는 데몬 스레드가 아니라서 main스레드가 종료되더라도 작업을 처리하기위해 계속 실행 상태로 남아있음.
//	스레드풀의 모든 스레드를 종료하려면 ExecutorService의 아래 두 메소드 중 하나를 실행해야 함 이 클래스의 코드에선 shotdownNow()를 사용함.
//	리턴타입				메소드명(매개변수)						설명
//	void 				shutdown()				현재 처리 중인 작업뿐 아니라, 작업 큐에 대기하고 있는 모든 작업을 처리한 뒤에 스레드풀을 종료시킴.
//	List<Runnable> 		shutdownNow()			현재 작업 처리중인 스레드를 interrupt해서 작업을 중시시키고, 스레드풀을 종료시킴. 리턴값은 작업 큐에 있는 미처리된 작업(Runnable)의 목록임.
//	즉, 남아있는 작업을 마무리하고 스레드를 종료할때는 shutdown() / 남아있는 작업이랑 상관없이 강제종료 할때는 shutdownNow()를 호출하면 됨.
}
