package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
//		1000개의 메일 생성
		String[][]mails = new String[1000][3];
		for (int i = 0; i <mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}
		
//		ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
//		이메일 보내는 장겁 생성 및 처리 요청
		for( int i = 0; i < 1000; i ++) {
			final int idx = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + ": " + content);
					
				}
			});
		}
//	하나의 작업은 Runnable 또는 Callable 구현 객체로 표현함. 이 둘의 차이점은 작업 처리 완료 후 리턴값이 있느냐 없느냐임.
//	ex) Runnable 익명 구현 객체: new Runnable() { @Override public void run() { 스레드가 처리할 작업 내용}}
//		Callable 익명 구현 객체: new Callable<T>() {@ Override public T call() throws Exception 스레드가 처리할 작업 내용 { return T;}}
//     ----------------------------------------------
//	Runnable의 run() 메소드는 리턴값이 없고, Callable의 call() 메소드는 리턴값이 있음. call()의 리턴 타입은 Callable <T> 에서 지정한 T타입 파라미터와 동일해야 함.
//	작업 처리 요청: ExecutorService의 작업 큐에 Runnable 또는 Callable 객체를 넣는 행위.  ExecutorService는 아래 두 가지 메소드를 제공함.
//	리턴 타입				메소드명(매개변수)							설명
//	void			excute(Runnable command)			 Runnable을 작업 큐에 저장 / 작업 처리 결과를 리턴하지 않음
//	Future<T>		submit(Callable<T> task)			 Callable을 작업 큐에 저장 / 작업 처리 결과를 얻을 수 있도록 Future를 리턴
		
//	위 코드는 1000개의 Runnable을 생성한 다음 execute() 메소드로 작업 큐에 넣음. ExecutorService는 최대 5개 스레드로 작업큐에서 Runnable을 하나씩 꺼내어 run()메소드를 실행하며 작업함.
		
		
		
	}
}
