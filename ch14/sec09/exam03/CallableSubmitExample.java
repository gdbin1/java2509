package ch14.sec09.exam03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {

	public static void main(String[] args) {
//		ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
//		계산 작업 생성 및 처리 요청
		for (int i = 1; i <= 100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i = 1; i <= idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계 산");
					return sum;
				}
			});
			
		try {
			int result = future.get();
			System.out.println("\t리턴값: " + result);
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
//		ExecutorService 종료
		executorService.shutdown();
	}
//	위 코딩은 100개의 Callable을 생성하고, submit() 메소드로 작업 큐에 넣음.
//	ExecutorsService는 최대 5개 스레드로 작업 큐에서 Callable을 하나씩 꺼내어 call() 메소드를 실행하면서 작업을 처리함.
//	31라인에서 future의 get() 메소드는 작업이 끝날때까지 기다렸다가 call() 메소드가 리턴한 값을 리턴함
}
